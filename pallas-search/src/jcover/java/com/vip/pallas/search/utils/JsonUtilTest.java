package com.vip.pallas.search.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import java.io.StringBufferInputStream;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.utils.JsonUtil
 *
 * @author Diffblue Cover
 */

public class JsonUtilTest {

	@Test
	public void getObjectMapper() {
		ObjectMapper result = JsonUtil.getObjectMapper();
		assertThat(result.getDeserializationConfig().getBase64Variant().getMaxLineLength(), is(2_147_483_647));
		assertThat(result.getDeserializationConfig().getBase64Variant().getName(), is("MIME-NO-LINEFEEDS"));
		assertThat(result.getDeserializationConfig().getBase64Variant().getPaddingByte(), is((byte) 61));
		assertThat(result.getDeserializationConfig().getBase64Variant().getPaddingChar(), is('='));
		assertThat(result.getDeserializationConfig().getProblemHandlers(), is(nullValue()));
		assertThat(result.getDeserializationConfig().isAnnotationProcessingEnabled(), is(true));
		assertThat(result.getJsonFactory().getCharacterEscapes(), is(nullValue()));
		assertThat(result.getJsonFactory().getInputDecorator(), is(nullValue()));
		assertThat(result.getJsonFactory().getOutputDecorator(), is(nullValue()));
		assertThat(result.getSerializationConfig().getFilterProvider(), is(nullValue()));
		assertThat(result.getSerializationConfig().getSerializationView(), is(nullValue()));
		assertThat(result.getSerializationConfig().isAnnotationProcessingEnabled(), is(true));
		assertThat(result.getSerializerProvider().getConfig(), is(nullValue()));
		assertThat(result.getSerializerProvider().getNullKeySerializer().isUnwrappingSerializer(), is(false));
		assertThat(result.getSerializerProvider().getNullValueSerializer().isUnwrappingSerializer(), is(false));
		assertThat(result.getSerializerProvider().getSerializationView(), is(nullValue()));
	}

	@Test
	public void toJsonValueIsFoo() throws Exception {
		assertThat(JsonUtil.toJson("foo"), is("\"foo\""));
	}

	@Test
	public void toJsonByteArrayValueIsFoo() throws Exception {
		assertArrayEquals(new byte[] { 34, 102, 111, 111, 34 }, JsonUtil.toJsonByteArray("foo"));
	}

	@Test
	public void parseJsonObject() throws Exception {
		assertThat(JsonUtil.parseJsonObject(new StringBufferInputStream("\"foo\"")).isEmpty(), is(true));
		assertThat(JsonUtil.parseJsonObject("\"foo\"").isEmpty(), is(true));
	}
}
