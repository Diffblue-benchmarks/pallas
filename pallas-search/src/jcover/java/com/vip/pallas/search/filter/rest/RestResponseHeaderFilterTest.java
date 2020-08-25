package com.vip.pallas.search.filter.rest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.rest.RestResponseHeaderFilter
 *
 * @author Diffblue Cover
 */

public class RestResponseHeaderFilterTest {

	@Test
	public void name() {
		assertThat(new RestResponseHeaderFilter().name(), is("PALLAS_FILTER_RESTRESPONSEHEADERFILTER"));
	}
}
