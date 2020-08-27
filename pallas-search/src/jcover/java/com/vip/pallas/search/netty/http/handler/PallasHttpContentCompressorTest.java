package com.vip.pallas.search.netty.http.handler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpResponse;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.vip.pallas.search.netty.http.handler.PallasHttpContentCompressor
 *
 * @author Diffblue Cover
 */

public class PallasHttpContentCompressorTest {

	@Test
	public void factory() {
		// pojo PallasHttpContentCompressor
	}

	@Test
	public void isSharableReturnsFalse() {
		assertThat(new PallasHttpContentCompressor().isSharable(), is(false));
	}

	@Test
	public void encode() throws Exception {

		// arrange
		ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);
		HttpObject msg = mock(HttpObject.class);
		ArrayList<Object> out = new ArrayList<Object>();
		out.add(new Object());

		// act
		new PallasHttpContentCompressor().encode(ctx, msg, out);

		// assert
		assertThat(out.size(), is(2));
		// pojo HttpObject.829502376
	}

	@Test
	public void beginEncode1() throws Exception {
		HttpResponse response = mock(HttpResponse.class);
		// pojo io.netty.handler.codec.http.HttpContentEncoder.Result
	}

	@Test
	public void beginEncode2() throws Exception {
		HttpHeaders httpHeaders = mock(HttpHeaders.class);
		when(httpHeaders.get(Mockito.<CharSequence>any()))
			.thenReturn("foo");
		HttpResponse response = mock(HttpResponse.class);
		when(response.headers())
			.thenReturn(httpHeaders);
		assertThat(new PallasHttpContentCompressor().beginEncode(response, "/some/path.html"), is(nullValue()));
	}

	@Test
	public void beginEncode3() throws Exception {
		HttpHeaders httpHeaders = mock(HttpHeaders.class);
		when(httpHeaders.get(Mockito.<CharSequence>any()))
			.thenReturn("foo");
		HttpResponse response = mock(HttpResponse.class);
		when(response.headers())
			.thenReturn(httpHeaders);
		assertThat(new PallasHttpContentCompressor(1).beginEncode(response, "/some/path.html"), is(nullValue()));
	}
}
