package com.vip.pallas.search.netty.http.handler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import io.netty.channel.ChannelHandlerContext;

import net.jpountz.lz4.LZ4Factory;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.netty.http.handler.Lz4Encoder
 *
 * @author Diffblue Cover
 */

public class Lz4EncoderTest {

	@Test
	public void factory() {
		assertThat(new Lz4Encoder(LZ4Factory.fastestInstance(), false, 64).isClosed(), is(false));
	}

	@Test
	public void isSharable() {
		assertThat(new Lz4Encoder().isSharable(), is(false));
		assertThat(new Lz4Encoder(true).isSharable(), is(false));
	}

	@Test
	public void handlerAdded() throws Exception {
		ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);
		new Lz4Encoder().handlerAdded(ctx);
	}

	@Test
	public void handlerRemoved() throws Exception {
		ChannelHandlerContext ctx = mock(ChannelHandlerContext.class);
		new Lz4Encoder().handlerRemoved(ctx);
	}
}
