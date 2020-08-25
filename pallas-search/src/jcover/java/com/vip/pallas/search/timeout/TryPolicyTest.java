package com.vip.pallas.search.timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.timeout.TryPolicy
 *
 * @author Diffblue Cover
 */

public class TryPolicyTest {

	@Test
	public void factory() {
		TryPolicy tryPolicy = new TryPolicy(0, 1);
		assertThat(tryPolicy.getTimeoutMillis(), is(1));
		assertThat(tryPolicy.getTotalCountIncludedFirstTime(), is(0));
	}

	@Test
	public void allowRetry() {
		assertThat(new TryPolicy(0, 1).allowRetry(1), is(false));
		assertThat(new TryPolicy(1, 0).allowRetry(1), is(true));
	}
}
