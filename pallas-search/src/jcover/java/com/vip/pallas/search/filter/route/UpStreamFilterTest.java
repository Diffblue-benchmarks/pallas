package com.vip.pallas.search.filter.route;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.route.UpStreamFilter
 *
 * @author Diffblue Cover
 */

public class UpStreamFilterTest {

	@Test
	public void name() {
		assertThat(new UpStreamFilter().name(), is("PALLAS_FILTER_UPSTREAMFILTER"));
	}
}
