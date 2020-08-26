package com.vip.pallas.search.netty.http.handler;

import static org.mockito.Mockito.mock;

import com.vip.pallas.search.exception.PallasTimeoutException;
import com.vip.pallas.search.filter.common.SessionContext;
import com.vip.pallas.search.monitor.MonitorAccessLog;
import com.vip.pallas.search.netty.http.NettyPallasRequest;
import com.vip.pallas.search.trace.TraceAspect;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.FullHttpRequest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.protocol.HttpContext;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.vip.pallas.search.netty.http.handler.SendDirectlyCallback
 *
 * @author Diffblue Cover
 */

public class SendDirectlyCallbackTest {

	@Test
	public void initEndUpstreamTimeInMonitorAccessLog() throws CloneNotSupportedException, java.io.IOException, UnsupportedOperationException {
		SessionContext sessionContext = new SessionContext();
		sessionContext.setMonitorAccessLog(new MonitorAccessLog());
		HttpContext httpContext = mock(HttpContext.class);
		HttpRequestBase httpRequest2 = mock(HttpRequestBase.class);
		HttpEntity httpEntity = mock(HttpEntity.class);
		FullHttpRequest httpRequest3 = mock(FullHttpRequest.class);
		Channel channel2 = mock(Channel.class);
		new SendDirectlyCallback(new com.vip.pallas.search.filter.base.FilterContext(new com.vip.pallas.search.filter.rest.RestResponseHeaderFilter()), sessionContext, new io.netty.handler.codec.http.DefaultFullHttpRequest(new io.netty.handler.codec.http.HttpVersion("HTTP/1.1", 1, 1, false), new io.netty.handler.codec.http.HttpMethod("GET"), "/some/path.html"), httpContext, httpRequest2, httpEntity, new org.apache.http.HttpHost("/some/path.html"), "/some/path.html", new NettyPallasRequest(httpRequest3, channel2), new com.vip.pallas.search.model.ShardGroup("foo", new java.util.ArrayList<String>(), "Acme")).initEndUpstreamTimeInMonitorAccessLog();
	}

	@Test
	public void recordMercury() throws CloneNotSupportedException, java.io.IOException, UnsupportedOperationException {

		// arrange
		SessionContext sessionContext = new SessionContext();
		TraceAspect TraceAspect1 = mock(TraceAspect.class);
		sessionContext.setTraceAspect(TraceAspect1);
		HttpContext httpContext = mock(HttpContext.class);
		HttpRequestBase httpRequest2 = mock(HttpRequestBase.class);
		HttpEntity httpEntity = mock(HttpEntity.class);
		FullHttpRequest httpRequest3 = mock(FullHttpRequest.class);
		Channel channel2 = mock(Channel.class);

		// act
		new SendDirectlyCallback(new com.vip.pallas.search.filter.base.FilterContext(new com.vip.pallas.search.filter.rest.RestResponseHeaderFilter()), sessionContext, new io.netty.handler.codec.http.DefaultFullHttpRequest(new io.netty.handler.codec.http.HttpVersion("HTTP/1.1", 1, 1, false), new io.netty.handler.codec.http.HttpMethod("GET"), "/some/path.html"), httpContext, httpRequest2, httpEntity, new org.apache.http.HttpHost("/some/path.html"), "/some/path.html", new NettyPallasRequest(httpRequest3, channel2), new com.vip.pallas.search.model.ShardGroup("foo", new java.util.ArrayList<String>(), "Acme")).recordMercury(new PallasTimeoutException(), 1);

		// assert
		Mockito.verify(TraceAspect1).afterRestEnd(ArgumentMatchers.<Throwable>any(), ArgumentMatchers.eq((Integer) 1));
	}

	@Test
	public void doCircuitBreaker() throws CloneNotSupportedException, java.io.IOException, UnsupportedOperationException {
		SessionContext sessionContext = new SessionContext();
		FullHttpRequest httpRequest1 = mock(FullHttpRequest.class);
		Channel channel1 = mock(Channel.class);
		sessionContext.setRequest(new NettyPallasRequest(httpRequest1, channel1));
		HttpContext httpContext = mock(HttpContext.class);
		HttpRequestBase httpRequest2 = mock(HttpRequestBase.class);
		HttpEntity httpEntity = mock(HttpEntity.class);
		FullHttpRequest httpRequest3 = mock(FullHttpRequest.class);
		Channel channel2 = mock(Channel.class);
		new SendDirectlyCallback(new com.vip.pallas.search.filter.base.FilterContext(new com.vip.pallas.search.filter.rest.RestResponseHeaderFilter()), sessionContext, new io.netty.handler.codec.http.DefaultFullHttpRequest(new io.netty.handler.codec.http.HttpVersion("HTTP/1.1", 1, 1, false), new io.netty.handler.codec.http.HttpMethod("GET"), "/some/path.html"), httpContext, httpRequest2, httpEntity, new org.apache.http.HttpHost("/some/path.html"), "/some/path.html", new NettyPallasRequest(httpRequest3, channel2), new com.vip.pallas.search.model.ShardGroup("foo", new java.util.ArrayList<String>(), "Acme")).doCircuitBreaker();
	}
}
