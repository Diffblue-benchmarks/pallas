package com.vip.pallas.search.filter.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.vip.pallas.search.filter.rest.RestResponseHeaderFilter;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.base.FilterContext
 *
 * @author Diffblue Cover
 */

public class FilterContextTest {

	@Test
	public void factory() {
		AbstractFilter filter = new RestResponseHeaderFilter();
		filter.setValid(false);
		assertThat(new FilterContext(filter).getFilter().isValid(), is(false));
	}
}
