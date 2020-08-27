package com.vip.pallas.search.netty;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.netty.ByteBufManager
 *
 * @author Diffblue Cover
 */

public class ByteBufManagerTest {

	@Test
	public void initByteBufManager() {
		ByteBufManager.initByteBufManager();
	}

	@Test
	public void directBufferInitialCapacityIsOne() {
		ByteBuf result = ByteBufManager.directBuffer(1);
		assertThat(result.isDirect(), is(true));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(false));
		assertThat(result.isWritable(), is(true));
	}

	@Test
	public void directBufferInitialCapacityIsZero() {
		ByteBuf result = ByteBufManager.directBuffer(0);
		assertThat(result.isDirect(), is(true));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(false));
		assertThat(result.isWritable(), is(true));
	}

	@Test
	public void duplicateByteBuf() throws java.io.IOException {
		ByteBuf oldBuf = mock(ByteBuf.class);
		when(oldBuf.duplicate())
			.thenReturn(Unpooled.directBuffer());
		ByteBuf result = ByteBufManager.duplicateByteBuf(oldBuf);
		assertThat(result.isDirect(), is(true));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(false));
		assertThat(result.isWritable(), is(true));
	}

	@Test
	public void release1() throws java.io.IOException {
		ByteBuf buf = mock(ByteBuf.class);
		ByteBufManager.release(buf);
	}

	@Test
	public void release2() {
		ByteBufManager.release(null);
	}

	@Test
	public void deepRelease1() throws java.io.IOException {
		ByteBuf buf = mock(ByteBuf.class);
		ByteBufManager.deepRelease(buf);
	}

	@Test
	public void deepRelease2() {
		ByteBufManager.deepRelease(null);
	}

	@Test
	public void releaseMessageIsBar1() throws java.io.IOException {
		ByteBuf buf = mock(ByteBuf.class);
		ByteBufManager.release(buf, "bar");
	}

	@Test
	public void releaseMessageIsBar2() {
		ByteBufManager.release(null, "bar");
	}
}
