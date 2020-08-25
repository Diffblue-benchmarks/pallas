package com.vip.pallas.search.filter.circuitbreaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.SlidingTimeWindowCounter
 *
 * @author Diffblue Cover
 */

public class SlidingTimeWindowCounterTest {

	@Test
	public void factory() {
		SlidingTimeWindowCounter slidingTimeWindowCounter =
			 new SlidingTimeWindowCounter(0, "1234");
		slidingTimeWindowCounter.setCircuitBreakerInterval(1);
		assertThat(slidingTimeWindowCounter.getCircuitBreakerInterval(), is(1L));
		assertThat(slidingTimeWindowCounter.getId(), is("1234"));
	}

	@Test
	public void increaseRequestCounter() {
		new SlidingTimeWindowCounter(0, "1234").increaseRequestCounter();
	}

	@Test
	public void increaseFailedCounter() {
		new SlidingTimeWindowCounter(0, "1234").increaseFailedCounter();
	}

	@Test
	public void countRequestReturnsZero() {
		SlidingTimeWindowCounter slidingTimeWindowCounter =
			 new SlidingTimeWindowCounter(0, "1234");
		slidingTimeWindowCounter.setCircuitBreakerInterval(1);
		assertThat(slidingTimeWindowCounter.countRequest(), is(0L));
	}

	@Test
	public void countFailedReturnsZero() {
		SlidingTimeWindowCounter slidingTimeWindowCounter =
			 new SlidingTimeWindowCounter(0, "1234");
		slidingTimeWindowCounter.setCircuitBreakerInterval(1);
		assertThat(slidingTimeWindowCounter.countFailed(), is(0L));
	}

	@Test
	public void calculateErrorPercentage() {
		SlidingTimeWindowCounter slidingTimeWindowCounter =
			 new SlidingTimeWindowCounter(0, "1234");
		slidingTimeWindowCounter.setCircuitBreakerInterval(1);
		// pojo CircuitBreakerCounter.PercentageHolder
	}

	@Test
	public void cleanupFutureCounter() {
		new SlidingTimeWindowCounter(0, "1234").cleanupFutureCounter();
	}
}
