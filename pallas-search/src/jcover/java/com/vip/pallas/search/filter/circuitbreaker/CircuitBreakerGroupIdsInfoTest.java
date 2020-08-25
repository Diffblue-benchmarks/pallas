package com.vip.pallas.search.filter.circuitbreaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.CircuitBreakerGroupIdsInfo
 *
 * @author Diffblue Cover
 */

public class CircuitBreakerGroupIdsInfoTest {

	@Test
	public void factory() {
		CircuitBreakerGroupIdsInfo circuitBreakerGroupIdsInfo =
			 new CircuitBreakerGroupIdsInfo();
		circuitBreakerGroupIdsInfo.setThrottled(false);
		assertThat(circuitBreakerGroupIdsInfo.getServiceInvokeHashKeys(), empty());
		assertThat(circuitBreakerGroupIdsInfo.isThrottled(), is(false));
	}
}
