package com.vip.pallas.search.timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.timeout.AsyncCall
 *
 * @author Diffblue Cover
 */

public class AsyncCallTest {

	@Test
	public void replaceUriValueKeyIsKeyAndNewValueIsValueAndUriIsBar() {
		assertThat(AsyncCall.replaceUriValue("bar", "key", "value"), is("bar?keyvalue"));
	}
}
