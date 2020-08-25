package com.vip.pallas.search.filter.rest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.rest.RestInvokerFilter
 *
 * @author Diffblue Cover
 */

public class RestInvokerFilterTest {

	@Test
	public void factory() {
		RestInvokerFilter restInvokerFilter = new RestInvokerFilter();
		restInvokerFilter.setValid(false);
		assertThat(restInvokerFilter.isValid(), is(false));
	}

	@Test
	public void shutdown() {
		new RestInvokerFilter().shutdown();
	}

	@Test
	public void name() {
		assertThat(new RestInvokerFilter().name(), is("PALLAS_FILTER_RESTINVOKERFILTER"));
	}
}
