package com.vip.pallas.search.cache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.cache.RoutingCache
 *
 * @author Diffblue Cover
 */

public class RoutingCacheTest {

	@Test
	public void fetchDataKeyIsKeyReturnsNull() {
		assertThat(new RoutingCache().fetchData("key"), is(nullValue()));
	}

	@Test
	public void extractPortFromAddress() {
		assertThat(RoutingCache.extractPortFromAddress("280 Broadway"), is("9200"));
		assertThat(RoutingCache.extractPortFromAddress(":0"), is("0"));
	}

	@Test
	public void getAbnormalNodeListReturnsEmpty() {
		assertThat(new RoutingCache().getAbnormalNodeList("John Smith"), empty());
	}
}
