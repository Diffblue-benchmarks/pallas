package com.vip.pallas.search.rampup;

import static org.mockito.Mockito.mock;

import com.vip.pallas.search.utils.HttpClientUtil;

import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.rampup.RampupHandler
 *
 * @author Diffblue Cover
 */

public class RampupHandlerTest {

	@Test
	public void rampupIfNecessaryIndexNameIsAcme() throws java.io.IOException, UnsupportedOperationException {
		HttpEntity entity = mock(HttpEntity.class);
		RampupHandler.rampupIfNecessary(new HttpHost("/some/path.html"), "/some/path.html", new DefaultFullHttpRequest(new HttpVersion("HTTP/1.1", 1, 1, false), new HttpMethod("GET"), "/some/path.html"), HttpClientUtil.getHttpUriRequest(new HttpHost("/some/path.html"), new DefaultFullHttpRequest(new HttpVersion("/some/path.html", 1, 1, false), HttpMethod.valueOf("GET"), "/some/path.html")), entity, "Acme", "1234");
	}

	@Test
	public void shutdown() {
		RampupHandler.shutdown();
	}
}
