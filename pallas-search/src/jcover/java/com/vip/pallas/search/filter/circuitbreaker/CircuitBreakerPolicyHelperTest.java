package com.vip.pallas.search.filter.circuitbreaker;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.CircuitBreakerPolicyHelper
 *
 * @author Diffblue Cover
 */

public class CircuitBreakerPolicyHelperTest {

	@Test
	public void putPolicyCircuitBreakerPolicyContentIsBar() {
		CircuitBreakerPolicyHelper.putPolicy("key", "bar");
	}

	@Test
	public void putPolicyCircuitBreakerPolicyContentIsEmpty() {
		CircuitBreakerPolicyHelper.putPolicy("key", "");
	}

	@Test
	public void putPolicyCircuitBreakerPolicyContentIsHello() {
		CircuitBreakerPolicyHelper.putPolicy("key", "hello");
	}

	@Test
	public void cleanPolicyKeyIsKey() {
		CircuitBreakerPolicyHelper.cleanPolicy("key");
	}
}
