package com.vip.pallas.search.filter.route;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.route.FlowRecordFilter
 *
 * @author Diffblue Cover
 */

public class FlowRecordFilterTest {

	@Test
	public void name() {
		assertThat(new FlowRecordFilter().name(), is("PALLAS_FILTER_FLOWRECORDFILTER"));
	}

	@Test
	public void getFlowRecordQueueReturnsEmpty() {
		assertThat(FlowRecordFilter.getFlowRecordQueue().isEmpty(), is(true));
	}
}
