package com.vip.pallas.search.filter.rest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.rest.RestRequestUriFilter
 *
 * @author Diffblue Cover
 */

public class RestRequestUriFilterTest {

	@Test
	public void name() {
		assertThat(new RestRequestUriFilter().name(), is("PALLAS_FILTER_RESTREQUESTURIFILTER"));
	}
}
