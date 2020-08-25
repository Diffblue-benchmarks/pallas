package com.vip.pallas.search.filter.rest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.rest.RestRequestBodyFilter
 *
 * @author Diffblue Cover
 */

public class RestRequestBodyFilterTest {

	@Test
	public void name() {
		assertThat(new RestRequestBodyFilter().name(), is("PALLAS_FILTER_RESTREQUESTBODYFILTER"));
	}
}
