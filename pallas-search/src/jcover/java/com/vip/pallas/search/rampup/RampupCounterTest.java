package com.vip.pallas.search.rampup;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.rampup.RampupCounter
 *
 * @author Diffblue Cover
 */

public class RampupCounterTest {

	@Test
	public void start() {
		RampupCounter.start();
	}

	@Test
	public void run() {
		new RampupCounter().run();
	}

	@Test
	public void getRampupCounterMapReturnsEmpty() {
		assertThat(RampupCounter.getRampupCounterMap().isEmpty(), is(true));
	}
}
