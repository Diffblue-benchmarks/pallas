package com.vip.pallas.search.utils;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.FullHttpRequest;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.utils.HttpClientUtil
 *
 * @author Diffblue Cover
 */

public class HttpClientUtilTest {

	@Test
	public void moveByteIntoHeapReturnsEmpty() {
		FullHttpRequest request = mock(FullHttpRequest.class);
		when(request.content())
			.thenReturn(Unpooled.directBuffer());
		assertArrayEquals(new byte[] { }, HttpClientUtil.moveByteIntoHeap(request));
	}
}
