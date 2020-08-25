package com.vip.pallas.search.filter.circuitbreaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.SamplerCounter
 *
 * @author Diffblue Cover
 */

public class SamplerCounterTest {

	@Test
	public void factory() {
		SamplerCounter samplerCounter = new SamplerCounter(0, "1234");
		samplerCounter.setCircuitBreakerInterval(1);
		assertThat(samplerCounter.getCircuitBreakerInterval(), is(0L));
		assertThat(samplerCounter.getId(), is("1234"));
	}

	@Test
	public void increaseRequestCounter() {
		new SamplerCounter(1, "1234").increaseRequestCounter();
	}

	@Test
	public void increaseFailedCounter() {
		new SamplerCounter(1, "1234").increaseFailedCounter();
	}

	@Test
	public void countRequestReturnsZero() {
		assertThat(new SamplerCounter(0, "1234").countRequest(), is(0L));
	}

	@Test
	public void countFailedReturnsZero() {
		assertThat(new SamplerCounter(0, "1234").countFailed(), is(0L));
	}

	@Test
	public void calculateErrorPercentage() {
		// pojo CircuitBreakerCounter.PercentageHolder
	}

	@Test
	public void cleanupFutureCounter() {
		new SamplerCounter(1, "1234").cleanupFutureCounter();
	}
}
