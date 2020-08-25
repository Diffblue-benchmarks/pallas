package com.vip.pallas.search.filter.route;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.vip.pallas.search.exception.PallasTimeoutException;
import com.vip.pallas.search.filter.common.SessionContext;
import com.vip.pallas.search.netty.http.NettyPallasRequest;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.handler.codec.DecoderResult;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.route.BalanceFilter
 *
 * @author Diffblue Cover
 */

public class BalanceFilterTest {

	@Test
	public void name() {
		assertThat(new BalanceFilter().name(), is("PALLAS_FILTER_BALANCEFILTER"));
	}

	@Test
	public void getLBHashKeyReturnsFoo() throws java.io.UnsupportedEncodingException {
		SessionContext sessionContext = new SessionContext();
		HttpHeaders httpHeaders1 = mock(HttpHeaders.class);
		HttpHeaders httpHeaders2 = mock(HttpHeaders.class);
		HttpHeaders httpHeaders3 = mock(HttpHeaders.class);
		HttpHeaders httpHeaders4 = mock(HttpHeaders.class);
		HttpHeaders httpHeaders5 = mock(HttpHeaders.class);
		HttpHeaders httpHeaders6 = mock(HttpHeaders.class);
		HttpHeaders httpHeaders7 = mock(HttpHeaders.class);
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.getMethod())
			.thenReturn(new HttpMethod("GET"))
			.thenReturn(new HttpMethod("GET"));
		when(httpRequest.getUri())
			.thenReturn("foo")
			.thenReturn("foo");
		when(httpRequest.getProtocolVersion())
			.thenReturn(new HttpVersion("HTTP/1.1", 1, 1, false));
		when(httpRequest.headers())
			.thenReturn(httpHeaders1)
			.thenReturn(httpHeaders2)
			.thenReturn(httpHeaders3)
			.thenReturn(httpHeaders4)
			.thenReturn(httpHeaders5)
			.thenReturn(httpHeaders6)
			.thenReturn(httpHeaders7);
		when(httpRequest.getDecoderResult())
			.thenReturn(DecoderResult.failure(new PallasTimeoutException()));
		when(httpRequest.content())
			.thenReturn(Unpooled.directBuffer())
			.thenReturn(Unpooled.directBuffer())
			.thenReturn(Unpooled.directBuffer());
		Channel channel = mock(Channel.class);
		sessionContext.setRequest(new NettyPallasRequest(httpRequest, channel));
		assertThat(new BalanceFilter().getLBHashKey(sessionContext), is("foo"));
		assertThat(sessionContext.getRequest().getCookieMap().isEmpty(), is(true));
		assertThat(sessionContext.getRequest().getParameterMap().isEmpty(), is(true));
	}
}
