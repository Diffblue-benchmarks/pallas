package com.vip.pallas.search.rampup;

import static org.mockito.Mockito.mock;

import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.rampup.RampupHandler
 *
 * @author Diffblue Cover
 */

public class RampupHandlerTest {

	@Test
	public void rampupIfNecessaryIndexNameIsAcme() throws CloneNotSupportedException, java.io.IOException, UnsupportedOperationException {
		HttpRequestBase httpRequest = mock(HttpRequestBase.class);
		HttpEntity entity = mock(HttpEntity.class);
		RampupHandler.rampupIfNecessary(new HttpHost("/some/path.html"), "/some/path.html", new DefaultFullHttpRequest(new HttpVersion("HTTP/1.1", 1, 1, false), new HttpMethod("GET"), "/some/path.html"), httpRequest, entity, "Acme", "1234");
	}

	@Test
	public void shutdown() {
		RampupHandler.shutdown();
	}
}
