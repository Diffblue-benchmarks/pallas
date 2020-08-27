package com.vip.pallas.search.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.function.BiConsumer;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.utils.ElasticSearchStub
 *
 * @author Diffblue Cover
 */

public class ElasticSearchStubTest {

	@Test
	public void getElasticRestClient() {
		// pojo org.elasticsearch.client.RestClient
	}

	@Test
	public void performRequestClusterHttpAddressIsEmpty() {
		@SuppressWarnings("unchecked")
		BiConsumer<String, List<String[]>> comsumer = mock(BiConsumer.class);
		assertThat(ElasticSearchStub.performRequest("", "api.github.com", comsumer), empty());
	}

	@Test
	public void performRequestClusterHttpAddressIsNull() {
		@SuppressWarnings("unchecked")
		BiConsumer<String, List<String[]>> comsumer = mock(BiConsumer.class);
		assertThat(ElasticSearchStub.performRequest(null, "api.github.com", comsumer), empty());
	}
}
