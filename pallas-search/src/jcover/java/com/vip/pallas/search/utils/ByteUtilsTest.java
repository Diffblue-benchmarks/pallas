package com.vip.pallas.search.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.utils.ByteUtils
 *
 * @author Diffblue Cover
 */

public class ByteUtilsTest {

	@Test
	public void toBytesStrIsNullReturnsNull() {
		assertThat(ByteUtils.toBytes(null), is(nullValue()));
	}

	@Test
	public void toByteBufStrIsFoo() {
		ByteBuf result = ByteUtils.toByteBuf("foo");
		assertThat(result.isDirect(), is(false));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(true));
		assertThat(result.isWritable(), is(false));
	}

	@Test
	public void toByteBufStrIsNull() {
		ByteBuf result = ByteUtils.toByteBuf(null);
		assertThat(result.isDirect(), is(true));
		assertThat(result.isReadOnly(), is(false));
		assertThat(result.isReadable(), is(false));
		assertThat(result.isWritable(), is(false));
	}

	@Test
	public void safeRelease() {
		ByteUtils.safeRelease(Unpooled.directBuffer());
	}

	@Test
	public void safeReleaseBufIsNull() {
		ByteUtils.safeRelease(null);
	}

	@Test
	public void deepSafeRelease() {
		ByteUtils.deepSafeRelease(Unpooled.directBuffer());
	}

	@Test
	public void deepSafeReleaseBufIsNull() {
		ByteUtils.deepSafeRelease(null);
	}
}
