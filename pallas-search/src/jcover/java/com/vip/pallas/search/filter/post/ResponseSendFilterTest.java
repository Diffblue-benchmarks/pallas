package com.vip.pallas.search.filter.post;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpVersion;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.post.ResponseSendFilter
 *
 * @author Diffblue Cover
 */

public class ResponseSendFilterTest {

	@Test
	public void name() {
		assertThat(new ResponseSendFilter().name(), is("PALLAS_FILTER_RESPONSESENDFILTER"));
	}

	@Test
	public void getFullHttpResponseHttpCodeIsOne() {
		// pojo io.netty.handler.codec.http.FullHttpResponse
	}

	@Test
	public void getFullHttpResponseHttpCodeIsZero() throws java.io.IOException {
		ByteBuf body = mock(ByteBuf.class);
		// pojo io.netty.handler.codec.http.FullHttpResponse
	}

	@Test
	public void shutdown() {
		new ResponseSendFilter().shutdown();
	}
}
