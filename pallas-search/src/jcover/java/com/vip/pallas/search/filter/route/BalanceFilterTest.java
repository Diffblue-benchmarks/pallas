package com.vip.pallas.search.filter.route;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.route.BalanceFilter
 *
 * @author Diffblue Cover
 */

public class BalanceFilterTest {

	@Test
	public void name() {
		assertThat(new BalanceFilter().name(), is("PALLAS_FILTER_BALANCEFILTER"));
	}
}
