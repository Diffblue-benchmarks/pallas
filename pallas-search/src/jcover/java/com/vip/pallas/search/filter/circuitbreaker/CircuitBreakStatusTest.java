package com.vip.pallas.search.filter.circuitbreaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.CircuitBreakStatus
 *
 * @author Diffblue Cover
 */

public class CircuitBreakStatusTest {

	@Test
	public void valuesReturnsOpenHalf_openClosed() {
		CircuitBreakStatus[] result = CircuitBreakStatus.values();
		assertThat(result[0], is(CircuitBreakStatus.OPEN));
		assertThat(result[1], is(CircuitBreakStatus.HALF_OPEN));
		assertThat(result[2], is(CircuitBreakStatus.CLOSED));
	}
}
