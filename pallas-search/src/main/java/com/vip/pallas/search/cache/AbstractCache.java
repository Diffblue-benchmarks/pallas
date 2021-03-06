/**
 * Copyright 2019 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.pallas.search.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.vip.pallas.thread.PallasThreadFactory;
import com.vip.pallas.utils.PallasBasicProperties;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class AbstractCache<K, V> {

	LoadingCache<K, V> cache;

	public LoadingCache<K, V> getCache() {
		return cache;
	}

	public void init() {
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2
				, new PallasThreadFactory("pallas-search-cache-pool"));

		ListeningExecutorService refreshPools = MoreExecutors.listeningDecorator(executorService);

		cache = CacheBuilder.newBuilder().maximumSize(PallasBasicProperties.CACHE_MAXIMUM_SIZE)
				.refreshAfterWrite(PallasBasicProperties.REFRESH_AFTER_WRITE_DURATION, TimeUnit.SECONDS)
				.expireAfterAccess(PallasBasicProperties.EXPIRE_AFTER_ACCESS_DURATION, TimeUnit.SECONDS)//设置时间对象没有被读/写访问则对象从内存中删除
				.expireAfterWrite(PallasBasicProperties.EXPIRE_AFTER_WRITE_DURATION, TimeUnit.SECONDS) //设置时间对象没有被写访问则对象从内存中删除
				.recordStats()
				.build(new CacheLoader<K, V>() {
					@Override
					public V load(K key) {
						return fetchData(key);
					}
					@Override
					public ListenableFuture<V> reload(final K key, final V oldValue) {
						V newValue = load(key);
						return refreshPools.submit(() -> newValue);
					}
				});

		executorService.scheduleAtFixedRate(() -> cache.asMap().keySet().stream().
						forEach((k -> cache.refresh(k))), PallasBasicProperties.REFRESH_AFTER_WRITE_DURATION,
									PallasBasicProperties.REFRESH_AFTER_WRITE_DURATION, TimeUnit.SECONDS);
	}

	protected abstract V fetchData(K key);
}
