package com.vip.pallas.search.filter.post;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.post.CommonResponseHeaderFilter
 *
 * @author Diffblue Cover
 */

public class CommonResponseHeaderFilterTest {

	@Test
	public void name() {
		assertThat(new CommonResponseHeaderFilter().name(), is("PALLAS_FILTER_COMMONRESPONSEHEADERFILTER"));
	}
}
