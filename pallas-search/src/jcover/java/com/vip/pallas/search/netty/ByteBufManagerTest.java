package com.vip.pallas.search.netty;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
	public void duplicateByteBuf() {
		ByteBuf result = ByteBufManager.duplicateByteBuf(Unpooled.directBuffer());
		assertThat(result.isDirect(), is(true));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(false));
		assertThat(result.isWritable(), is(true));
	}

	@Test
	public void release() {
		ByteBufManager.release(Unpooled.directBuffer());
	}

	@Test
	public void releaseBufIsNull() {
		ByteBufManager.release(null);
	}

	@Test
	public void deepRelease() {
		ByteBufManager.deepRelease(Unpooled.directBuffer());
	}

	@Test
	public void deepReleaseBufIsNull() {
		ByteBufManager.deepRelease(null);
	}

	@Test
	public void releaseBufIsNullAndMessageIsBar() {
		ByteBufManager.release(null, "bar");
	}

	@Test
	public void releaseMessageIsBar() {
		ByteBufManager.release(Unpooled.directBuffer(), "bar");
	}
}
