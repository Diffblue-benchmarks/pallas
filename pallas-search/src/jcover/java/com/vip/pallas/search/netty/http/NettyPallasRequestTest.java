package com.vip.pallas.search.netty.http;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.vip.pallas.search.model.ShardGroup;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.netty.http.NettyPallasRequest
 *
 * @author Diffblue Cover
 */

public class NettyPallasRequestTest {

	@Test
	public void factory() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		NettyPallasRequest nettyPallasRequest =
			 new NettyPallasRequest(httpRequest, channel);
		nettyPallasRequest.setCircuitBreaker(true);
		byte[] fixContent = new byte[] { 1 };
		nettyPallasRequest.setFixScrollRequestContent(fixContent);
		nettyPallasRequest.setIsIndexSearch(false);
		nettyPallasRequest.setLogicClusterId("/some/path.html");
		nettyPallasRequest.setPreference("/some/path.html");
		nettyPallasRequest.setRoutePrimaryFirst(false);
		nettyPallasRequest.setRouteReplicaFirst(false);
		nettyPallasRequest.setScrollContinue(false);
		nettyPallasRequest.setScrollFirst(false);
		ArrayList<String> ipAndPortList = new ArrayList<String>();
		ipAndPortList.add("foo");
		ShardGroup shardGroup = new ShardGroup("foo", ipAndPortList, "Acme");
		shardGroup.setId("1234");
		shardGroup.setIndexName("Acme");
		shardGroup.setPreferNodes("foo");
		shardGroup.setServerList(new ArrayList<String>());
		nettyPallasRequest.setShardGroup(shardGroup);
		nettyPallasRequest.setShardGroupList(new ArrayList<ShardGroup>());
		nettyPallasRequest.setTargetGroupId(1L);
		assertArrayEquals(new byte[] { 1 }, nettyPallasRequest.getFixScrollRequestContent());
		assertThat(nettyPallasRequest.getNewHeaderNames(), empty());
		assertThat(nettyPallasRequest.getPreference(), is("/some/path.html"));
		assertThat(nettyPallasRequest.getShardGroup(), sameInstance(shardGroup));
		assertThat(nettyPallasRequest.getShardGroupList(), empty());
		assertThat(nettyPallasRequest.getTargetGroupId(), is(1L));
		assertThat(nettyPallasRequest.isCircuitBreakerOn(), is(true));
		assertThat(nettyPallasRequest.isIndexSearch(), is(false));
		assertThat(nettyPallasRequest.isRoutePrimaryFirst(), is(false));
		assertThat(nettyPallasRequest.isRouteReplicaFirst(), is(false));
		assertThat(nettyPallasRequest.isScrollContinue(), is(false));
		assertThat(nettyPallasRequest.isScrollFirst(), is(false));
	}

	@Test
	public void getMethodReturnsGET() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.getMethod())
			.thenReturn(new HttpMethod("GET"));
		Channel channel = mock(Channel.class);
		assertThat(new NettyPallasRequest(httpRequest, channel).getMethod(), is("GET"));
	}

	@Test
	public void getHttpMethod() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.getMethod())
			.thenReturn(new HttpMethod("GET"));
		Channel channel = mock(Channel.class);
		// pojo HttpMethod
	}

	@Test
	public void addParamterByUrlAndkeyKeyIsNullAndParamsIsData() throws IllegalArgumentException {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		new NettyPallasRequest(httpRequest, channel).addParamterByUrlAndkey("data", null);
	}

	@Test
	public void addParamterByUrlAndkeyParamsIsEmpty() throws IllegalArgumentException {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		new NettyPallasRequest(httpRequest, channel).addParamterByUrlAndkey("", "/some/path.html");
	}

	@Test
	public void addParamterByUrlAndkeyParamsIsNull() throws IllegalArgumentException {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		new NettyPallasRequest(httpRequest, channel).addParamterByUrlAndkey(null, "/some/path.html");
	}

	@Test
	public void getModifiedUriReturnsFoo() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.getUri())
			.thenReturn("foo");
		Channel channel = mock(Channel.class);
		assertThat(new NettyPallasRequest(httpRequest, channel).getModifiedUri(), is("foo"));
	}

	@Test
	public void getModifyBodyContent() throws java.io.UnsupportedEncodingException {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.content())
			.thenReturn(Unpooled.directBuffer());
		Channel channel = mock(Channel.class);
		ByteBuf result =
			 new NettyPallasRequest(httpRequest, channel).getModifyBodyContent();
		assertThat(result.isDirect(), is(true));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(false));
		assertThat(result.isWritable(), is(true));
	}

	@Test
	public void getBodyStrForPostReturnsEmpty() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.content())
			.thenReturn(Unpooled.directBuffer());
		Channel channel = mock(Channel.class);
		assertThat(new NettyPallasRequest(httpRequest, channel).getBodyStrForPost(), is(""));
	}

	@Test
	public void getCookieNameIsNullReturnsNull() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		assertThat(new NettyPallasRequest(httpRequest, channel).getCookie(null), is(nullValue()));
	}

	@Test
	public void closeChannle() throws InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		ChannelFuture channelFuture = mock(ChannelFuture.class);
		Channel channel = mock(Channel.class);
		when(channel.close())
			.thenReturn(channelFuture);
		new NettyPallasRequest(httpRequest, channel).closeChannle();
	}

	@Test
	public void getIndexNameReturnsOo() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.getUri())
			.thenReturn("foo");
		Channel channel = mock(Channel.class);
		assertThat(new NettyPallasRequest(httpRequest, channel).getIndexName(), is("oo"));
	}

	@Test
	public void getContent() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.content())
			.thenReturn(Unpooled.directBuffer());
		Channel channel = mock(Channel.class);
		ByteBuf result = new NettyPallasRequest(httpRequest, channel).getContent();
		assertThat(result.isDirect(), is(true));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(false));
		assertThat(result.isWritable(), is(true));
	}

	@Test
	public void getLogicClusterIdReturnsBar() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		NettyPallasRequest nettyPallasRequest =
			 new NettyPallasRequest(httpRequest, channel);
		nettyPallasRequest.setLogicClusterId("bar");
		assertThat(nettyPallasRequest.getLogicClusterId(), is("bar"));
	}
}
