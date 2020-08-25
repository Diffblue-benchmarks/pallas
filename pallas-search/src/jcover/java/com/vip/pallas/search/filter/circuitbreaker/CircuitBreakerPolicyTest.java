package com.vip.pallas.search.filter.circuitbreaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.CircuitBreakerPolicy
 *
 * @author Diffblue Cover
 */

public class CircuitBreakerPolicyTest {

	@Test
	public void factory1() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(10);
		circuitBreakerPolicy.setInterval(1);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(1);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void factory2() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(120);
		circuitBreakerPolicy.setInterval(1);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(1);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(100));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void factory3() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(1);
		circuitBreakerPolicy.setInterval(1);
		circuitBreakerPolicy.setRecoverySampleVolume(-1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(1);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(10));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void factory4() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(1);
		circuitBreakerPolicy.setInterval(1);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(-1);
		circuitBreakerPolicy.setSleepWindow(1);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(10));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void factory5() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(1);
		circuitBreakerPolicy.setInterval(1);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(0);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void factory6() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(1);
		circuitBreakerPolicy.setInterval(1);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(601);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(600));
	}

	@Test
	public void factory7() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(-1);
		circuitBreakerPolicy.setInterval(0);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(1);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void factory8() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(-1);
		circuitBreakerPolicy.setInterval(5);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(1);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(5));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void factory9() {
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(-1);
		circuitBreakerPolicy.setInterval(601);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(1);
		assertThat(circuitBreakerPolicy.getErrorPercentage(), is(10));
		assertThat(circuitBreakerPolicy.getInterval(), is(600));
		assertThat(circuitBreakerPolicy.getRecoverySampleVolume(), is(1));
		assertThat(circuitBreakerPolicy.getRequestVolumeThreshold(), is(1));
		assertThat(circuitBreakerPolicy.getSleepWindow(), is(1));
	}

	@Test
	public void equalsReturnsFalse() {
		assertThat(new CircuitBreakerPolicy().equals(new Object()), is(false));
	}

	@Test
	public void equalsReturnsTrue() {
		CircuitBreakerPolicy circuitBreakerPolicy1 = new CircuitBreakerPolicy();
		circuitBreakerPolicy1.setErrorPercentage(1);
		circuitBreakerPolicy1.setInterval(1);
		circuitBreakerPolicy1.setRecoverySampleVolume(1);
		circuitBreakerPolicy1.setRequestVolumeThreshold(1);
		circuitBreakerPolicy1.setSleepWindow(1);
		CircuitBreakerPolicy circuitBreakerPolicy2 = new CircuitBreakerPolicy();
		circuitBreakerPolicy2.setErrorPercentage(1);
		circuitBreakerPolicy2.setInterval(1);
		circuitBreakerPolicy2.setRecoverySampleVolume(1);
		circuitBreakerPolicy2.setRequestVolumeThreshold(1);
		circuitBreakerPolicy2.setSleepWindow(1);
		assertThat(circuitBreakerPolicy1.equals(circuitBreakerPolicy2), is(true));
	}
}
