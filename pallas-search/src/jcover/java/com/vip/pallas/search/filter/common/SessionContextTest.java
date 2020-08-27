package com.vip.pallas.search.filter.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;

import com.vip.pallas.search.model.ServiceInfo;
import com.vip.pallas.search.model.ShardGroup;
import com.vip.pallas.search.monitor.MonitorAccessLog;
import com.vip.pallas.search.netty.http.NettyPallasRequest;
import com.vip.pallas.search.trace.TraceAspect;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpVersion;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.common.SessionContext
 *
 * @author Diffblue Cover
 */

public class SessionContextTest {

	@Test
	public void factory() throws java.io.IOException {
		SessionContext sessionContext = new SessionContext();
		sessionContext.setBodySend(false);
		sessionContext.setHttpCode(1);
		Channel inBoundChannel = mock(Channel.class);
		sessionContext.setInBoundChannel(inBoundChannel);
		MonitorAccessLog monitorAccessLog = new MonitorAccessLog();
		monitorAccessLog.setRequestBody("/some/path.html");
		sessionContext.setMonitorAccessLog(monitorAccessLog);
		sessionContext.setOspRequestBodyJson("\"foo\"");
		HashMap<String, String> ospRequestHeader = new HashMap<String, String>();
		ospRequestHeader.put("foo", "foo");
		sessionContext.setOspRequestHeader(ospRequestHeader);
		sessionContext.setPrintExceStackInfo(false);
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		NettyPallasRequest request = new NettyPallasRequest(httpRequest, channel);
		request.setCircuitBreaker(false);
		byte[] fixContent = new byte[] { 1 };
		request.setFixScrollRequestContent(fixContent);
		request.setIsIndexSearch(false);
		request.setLogicClusterId("/some/path.html");
		request.setPreference("/some/path.html");
		request.setRoutePrimaryFirst(false);
		request.setRouteReplicaFirst(false);
		request.setScrollContinue(false);
		request.setScrollFirst(false);
		ArrayList<String> ipAndPortList1 = new ArrayList<String>();
		ipAndPortList1.add("foo");
		ShardGroup shardGroup1 = new ShardGroup("foo", ipAndPortList1, "Acme");
		shardGroup1.setId("1234");
		shardGroup1.setIndexName("Acme");
		shardGroup1.setPreferNodes("foo");
		ArrayList<String> serverList1 = new ArrayList<String>();
		serverList1.add("foo=bar");
		shardGroup1.setServerList(serverList1);
		request.setShardGroup(shardGroup1);
		ArrayList<ShardGroup> groupList = new ArrayList<ShardGroup>();
		ArrayList<String> ipAndPortList2 = new ArrayList<String>();
		ipAndPortList2.add("Smith");
		ShardGroup shardGroup2 = new ShardGroup("Smith", ipAndPortList2, "Smith");
		shardGroup2.setId("1234");
		shardGroup2.setIndexName("Acme");
		shardGroup2.setPreferNodes("foo");
		ArrayList<String> serverList2 = new ArrayList<String>();
		serverList2.add("foo=bar");
		shardGroup2.setServerList(serverList2);
		groupList.add(shardGroup2);
		request.setShardGroupList(groupList);
		request.setTargetGroupId(1L);
		sessionContext.setRequest(request);
		sessionContext.setRequestCallBack("/some/path.html");
		ByteBuf responseBody = mock(ByteBuf.class);
		sessionContext.setResponseBody(responseBody);
		HttpHeaders responseHttpHeaders = mock(HttpHeaders.class);
		sessionContext.setResponseHttpHeaders(responseHttpHeaders);
		HttpVersion responseHttpVersion = new HttpVersion("HTTP/1.1", 1, 1, false);
		sessionContext.setResponseHttpVersion(responseHttpVersion);
		FullHttpResponse restFullHttpResponse = mock(FullHttpResponse.class);
		sessionContext.setRestFullHttpResponse(restFullHttpResponse);
		ByteBuf restRequestBody = mock(ByteBuf.class);
		sessionContext.setRestRequestBody(restRequestBody);
		sessionContext.setRestRequestUri("/some/path.html");
		ServiceInfo serviceInfo1 =
			 new ServiceInfo("280 Broadway", "Acme", "John Smith", "Mr");
		serviceInfo1.setBackendAddress("280 Broadway");
		serviceInfo1.setClusterName("John Smith");
		serviceInfo1.setIndexName("Acme");
		sessionContext.setServiceInfo(serviceInfo1);
		ArrayList<ServiceInfo> serviceInfoList = new ArrayList<ServiceInfo>();
		ServiceInfo serviceInfo2 =
			 new ServiceInfo("280 Broadway", "Smith", "John Smith", "Mr");
		serviceInfo2.setBackendAddress("280 Broadway");
		serviceInfo2.setClusterName("John Smith");
		serviceInfo2.setIndexName("Acme");
		serviceInfoList.add(serviceInfo2);
		sessionContext.setServiceInfoList(serviceInfoList);
		Exception throwable = new Exception();
		throwable.setStackTrace(new StackTraceElement[] { });
		sessionContext.setThrowable(throwable);
		sessionContext.setTimestampClientConnected(1L);
		sessionContext.setTimestampClientResponseRead(1L);
		sessionContext.setTimestampClientResponseReceived(1L);
		sessionContext.setTimestampClientStartExecute(1L);
		sessionContext.setTimestampServerChannelRead(1L);
		sessionContext.setTimestampServerResponseSend(1L);
		TraceAspect TraceAspect1 = mock(TraceAspect.class);
		sessionContext.setTraceAspect(TraceAspect1);
		assertThat(sessionContext.getHttpCode(), is(1));
		assertThat(sessionContext.getInBoundChannel(), sameInstance(inBoundChannel));
		assertThat(sessionContext.getMonitorAccessLog(), sameInstance(monitorAccessLog));
		assertThat(sessionContext.getOspRequestBodyJson(), is("\"foo\""));
		assertThat(sessionContext.getPrintExceStackInfo(), is(false));
		assertArrayEquals(new byte[] { 1 }, sessionContext.getRequest().getFixScrollRequestContent());
		assertThat(sessionContext.getRequest().getLogicClusterId(), is("/some/path.html"));
		assertThat(sessionContext.getRequest().getNewHeaderNames(), empty());
		assertThat(sessionContext.getRequest().getPreference(), is("/some/path.html"));
		assertThat(sessionContext.getRequest().getShardGroup(), sameInstance(shardGroup1));
		assertThat(sessionContext.getRequest().getShardGroupList().size(), is(1));
		assertThat(sessionContext.getRequest().getShardGroupList().get(0), sameInstance(shardGroup2));
		assertThat(sessionContext.getRequest().getTargetGroupId(), is(1L));
		assertThat(sessionContext.getRequest().isCircuitBreakerOn(), is(false));
		assertThat(sessionContext.getRequest().isIndexSearch(), is(false));
		assertThat(sessionContext.getRequest().isRoutePrimaryFirst(), is(false));
		assertThat(sessionContext.getRequest().isRouteReplicaFirst(), is(false));
		assertThat(sessionContext.getRequest().isScrollContinue(), is(false));
		assertThat(sessionContext.getRequest().isScrollFirst(), is(false));
		assertThat(sessionContext.getRequestCallBack(), is("/some/path.html"));
		assertThat(sessionContext.getResponseBody(), sameInstance(responseBody));
		assertThat(sessionContext.getResponseHttpVersion(), sameInstance(responseHttpVersion));
		assertThat(sessionContext.getRestFullHttpResponse(), sameInstance(restFullHttpResponse));
		assertThat(sessionContext.getRestRequestBody(), sameInstance(restRequestBody));
		assertThat(sessionContext.getRestRequestUri(), is("/some/path.html"));
		assertThat(sessionContext.getServiceInfo(), sameInstance(serviceInfo1));
		assertThat(sessionContext.getServiceInfoList().size(), is(1));
		assertThat(sessionContext.getServiceInfoList().get(0), sameInstance(serviceInfo2));
		assertThat(sessionContext.getThrowable().getCause(), is(nullValue()));
		assertThat(sessionContext.getThrowable().getMessage(), is(nullValue()));
		assertThat(sessionContext.getTimestampClientConnected(), is(1L));
		assertThat(sessionContext.getTimestampClientResponseRead(), is(1L));
		assertThat(sessionContext.getTimestampClientResponseReceived(), is(1L));
		assertThat(sessionContext.getTimestampClientStartExecute(), is(1L));
		assertThat(sessionContext.getTimestampServerChannelRead(), is(1L));
		assertThat(sessionContext.getTimestampServerResponseSend(), is(1L));
		assertThat(sessionContext.getTraceAspect(), sameInstance(TraceAspect1));
		assertThat(sessionContext.isBodySend(), is(false));
	}
}
