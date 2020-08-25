package com.vip.pallas.search.filter.circuitbreaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.CircuitBreakerService
 *
 * @author Diffblue Cover
 */

public class CircuitBreakerServiceTest {

	@Test
	public void getInstance() {
		CircuitBreakerService result = CircuitBreakerService.getInstance();
		assertThat(result.getGroupInvokeCounterMap().isEmpty(), is(true));
		assertThat(result.getHalfOpenGroupsList(), empty());
		assertThat(result.getOpenGroupsList(), empty());
	}

	@Test
	public void increaseServiceRequestCounterIdIsBar() {
		CircuitBreakerService.getInstance().increaseServiceRequestCounter("bar");
	}

	@Test
	public void handleFailedRequestCounterIdIsBar() {
		CircuitBreakerService.getInstance().handleFailedRequestCounter("bar");
	}

	@Test
	public void moveOpenCircuitBreakerServerToHalfOpen() {
		CircuitBreakerService.getInstance().moveOpenCircuitBreakerServerToHalfOpen("1234");
	}

	@Test
	public void increaseRequestCounterAndGet1() {

		// arrange
		CircuitBreakerService circuitBreakerService =
			 CircuitBreakerService.getInstance();
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setErrorPercentage(1);
		circuitBreakerPolicy.setInterval(1);
		circuitBreakerPolicy.setRecoverySampleVolume(1);
		circuitBreakerPolicy.setRequestVolumeThreshold(1);
		circuitBreakerPolicy.setSleepWindow(1);

		// act
		CircuitBreakerCounter result =
			 circuitBreakerService.increaseRequestCounterAndGet("bar", circuitBreakerPolicy);

		// assert
		assertThat(result.getCircuitBreakerInterval(), is(5L));
		assertThat(result.getId(), is("bar"));
		assertThat(circuitBreakerService.getGroupInvokeCounterMap().get("bar"), sameInstance(result));
	}

	@Test
	public void increaseRequestCounterAndGet2() {

		// arrange
		CircuitBreakerService circuitBreakerService =
			 CircuitBreakerService.getInstance();
		CircuitBreakerPolicy circuitBreakerPolicy = new CircuitBreakerPolicy();
		circuitBreakerPolicy.setInterval(1);

		// act
		CircuitBreakerCounter result =
			 circuitBreakerService.increaseRequestCounterAndGet("bar", circuitBreakerPolicy);

		// assert
		assertThat(result.getCircuitBreakerInterval(), is(5L));
		assertThat(result.getId(), is("bar"));
		assertThat(circuitBreakerService.getGroupInvokeCounterMap().get("bar"), sameInstance(result));
	}

	@Test
	public void reset() {

		// arrange
		CircuitBreakerService circuitBreakerService =
			 CircuitBreakerService.getInstance();

		// act
		circuitBreakerService.reset();

		// assert
		assertThat(circuitBreakerService.getGroupInvokeCounterMap().isEmpty(), is(true));
	}

	@Test
	public void clear() {
		CircuitBreakerService.getInstance().clear("1234");
	}
}
