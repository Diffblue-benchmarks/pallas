package com.vip.pallas.search.filter.rest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.rest.RestRequestHeaderFilter
 *
 * @author Diffblue Cover
 */

public class RestRequestHeaderFilterTest {

	@Test
	public void name() {
		assertThat(new RestRequestHeaderFilter().name(), is("PALLAS_FILTER_RESTREQUESTHEADERFILTER"));
	}
}
