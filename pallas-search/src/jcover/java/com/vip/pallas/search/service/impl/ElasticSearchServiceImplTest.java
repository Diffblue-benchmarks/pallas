package com.vip.pallas.search.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.service.impl.ElasticSearchServiceImpl
 *
 * @author Diffblue Cover
 */

public class ElasticSearchServiceImplTest {

	@Test
	public void getExcludeNodeListReturnsEmpty() {
		assertThat(new ElasticSearchServiceImpl().getExcludeNodeList("280 Broadway"), empty());
	}

	@Test
	public void getActualIndexsClusterHttpAddressIsEmptyReturnsEmpty() {
		assertThat(new ElasticSearchServiceImpl().getActualIndexs(""), empty());
	}

	@Test
	public void getIndexAndNodesClusterHttpAddressIsEmptyReturnsEmpty() {
		assertThat(new ElasticSearchServiceImpl().getIndexAndNodes(""), empty());
	}

	@Test
	public void getNodesInfoClusterHttpAddressIsEmptyReturnsEmpty() {
		assertThat(new ElasticSearchServiceImpl().getNodesInfo("").isEmpty(), is(true));
	}

	@Test
	public void genDynamicGroupIndexNameIsAcmeAndNodesInfoIsEmptyReturnsEmpty() {
		assertThat(new ElasticSearchServiceImpl().genDynamicGroup("/some/path.html", "Acme", new HashMap<String, String>()), empty());
	}
}
