package com.vip.pallas.search.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.utils.HttpClientUtil
 *
 * @author Diffblue Cover
 */

public class HttpClientUtilTest {

	@Test
	public void getHttpUriRequest10() throws java.io.IOException, UnsupportedOperationException {
		HttpEntity entity = mock(HttpEntity.class);
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("PATCH"), "/some/path.html"), entity);
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("PATCH"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest11() throws java.io.IOException, UnsupportedOperationException {
		HttpEntity entity = mock(HttpEntity.class);
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("POST"), "/some/path.html"), entity);
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("POST"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest12() throws java.io.IOException, UnsupportedOperationException {
		HttpEntity entity = mock(HttpEntity.class);
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("PUT"), "/some/path.html"), entity);
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("PUT"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest9() throws java.io.IOException, UnsupportedOperationException {
		HttpEntity entity = mock(HttpEntity.class);
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("DELETE"), "/some/path.html"), entity);
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("DELETE"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest1() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("DELETE"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("DELETE"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest2() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("GET"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("GET"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest3() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("HEAD"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("HEAD"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest4() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("OPTIONS"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("OPTIONS"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest5() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("PATCH"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("PATCH"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest6() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("POST"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("POST"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest7() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("PUT"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("PUT"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void getHttpUriRequest8() {
		HttpRequestBase result =
			 HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), new HttpMethod("TRACE"), "/some/path.html"));
		assertThat(result.getConfig(), is(nullValue()));
		assertThat(result.getMethod(), is("TRACE"));
		assertThat(result.getURI().toString(), is("/some/path.html"));
	}

	@Test
	public void moveByteIntoHeapReturnsEmpty() {
		FullHttpRequest request = mock(FullHttpRequest.class);
		when(request.content())
			.thenReturn(Unpooled.directBuffer());
		assertArrayEquals(new byte[] { }, HttpClientUtil.moveByteIntoHeap(request));
	}
}
