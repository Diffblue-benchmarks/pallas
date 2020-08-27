package com.vip.pallas.search.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import io.netty.buffer.ByteBuf;

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
	public void safeRelease1() throws java.io.IOException {
		ByteBuf buf = mock(ByteBuf.class);
		ByteUtils.safeRelease(buf);
	}

	@Test
	public void safeRelease2() {
		ByteUtils.safeRelease(null);
	}

	@Test
	public void deepSafeRelease1() throws java.io.IOException {
		ByteBuf buf = mock(ByteBuf.class);
		ByteUtils.deepSafeRelease(buf);
	}

	@Test
	public void deepSafeRelease2() {
		ByteUtils.deepSafeRelease(null);
	}
}
