package com.vip.pallas.search.filter.base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.base.DefaultFilterPipeLine
 *
 * @author Diffblue Cover
 */

public class DefaultFilterPipeLineTest {

	@Test
	public void getInstance() {
		assertThat(DefaultFilterPipeLine.getInstance().getAllFilter(), empty());
	}
}
