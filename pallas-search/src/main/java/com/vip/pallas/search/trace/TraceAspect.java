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

package com.vip.pallas.search.trace;

import com.vip.pallas.search.filter.common.SessionContext;

import io.netty.handler.codec.http.HttpHeaders;

public abstract class TraceAspect {

	public abstract void beforeFilterStart(SessionContext sessionContext);

	public abstract void afterFilterEnd(SessionContext sessionContext);

	public abstract void beforeRestStart(SessionContext sessionContext, HttpHeaders httpHeaders);

	public abstract void afterRestEnd(Throwable throwable, int responseCode);

	public abstract String getTraceId();

}
