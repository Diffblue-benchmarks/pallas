package com.vip.pallas.search.filter.post;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpVersion;

import org.junit.Test;
import org.mockito.Mockito;

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
	public void getFullHttpResponse() {
		// pojo io.netty.handler.codec.http.FullHttpResponse
		// pojo io.netty.handler.codec.http.FullHttpResponse
	}

	@Test
	public void shutdown() {
		new ResponseSendFilter().shutdown();
	}
}
