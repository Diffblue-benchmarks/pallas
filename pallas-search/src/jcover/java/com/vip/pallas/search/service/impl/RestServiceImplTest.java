package com.vip.pallas.search.service.impl;

import static org.mockito.Mockito.mock;

import com.vip.pallas.search.netty.http.NettyPallasRequest;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.FullHttpRequest;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.service.impl.RestServiceImpl
 *
 * @author Diffblue Cover
 */

public class RestServiceImplTest {

	@Test
	public void updateRouting() {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		Channel channel = mock(Channel.class);
		// pojo io.netty.handler.codec.http.FullHttpResponse
	}
}
