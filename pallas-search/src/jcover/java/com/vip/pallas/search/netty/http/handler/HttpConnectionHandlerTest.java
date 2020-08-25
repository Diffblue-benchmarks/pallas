package com.vip.pallas.search.netty.http.handler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.netty.http.handler.HttpConnectionHandler
 *
 * @author Diffblue Cover
 */

public class HttpConnectionHandlerTest {

	@Test
	public void isSharableReturnsTrue() {
		assertThat(new HttpConnectionHandler().isSharable(), is(true));
	}
}
