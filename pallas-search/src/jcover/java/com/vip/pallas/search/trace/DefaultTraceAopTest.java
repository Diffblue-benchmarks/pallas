package com.vip.pallas.search.trace;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.trace.DefaultTraceAop
 *
 * @author Diffblue Cover
 */

public class DefaultTraceAopTest {

	@Test
	public void newTrace() {
		assertThat(new DefaultTraceAop().newTrace().getTraceId(), is(nullValue()));
	}

	@Test
	public void start() {
		new DefaultTraceAop().start();
	}
}
