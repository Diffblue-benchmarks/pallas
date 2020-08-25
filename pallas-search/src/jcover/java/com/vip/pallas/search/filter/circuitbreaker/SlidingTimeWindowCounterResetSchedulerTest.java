package com.vip.pallas.search.filter.circuitbreaker;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.SlidingTimeWindowCounterResetScheduler
 *
 * @author Diffblue Cover
 */

public class SlidingTimeWindowCounterResetSchedulerTest {

	@Test
	public void init() {
		SlidingTimeWindowCounterResetScheduler.init(CircuitBreakerService.getInstance());
	}
}
