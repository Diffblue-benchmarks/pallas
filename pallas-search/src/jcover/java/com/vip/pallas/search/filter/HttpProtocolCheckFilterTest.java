package com.vip.pallas.search.filter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.HttpProtocolCheckFilter
 *
 * @author Diffblue Cover
 */

public class HttpProtocolCheckFilterTest {

	@Test
	public void name() {
		assertThat(new HttpProtocolCheckFilter().name(), is("PALLAS_FILTER_HTTPPROTOCOLCHECKFILTER"));
	}
}
