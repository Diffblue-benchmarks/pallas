package com.vip.pallas.search.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.vip.pallas.search.utils.MyObjectMapper
 *
 * @author Diffblue Cover
 */

public class MyObjectMapperTest {

	@Test
	public void getInstance() {
		MyObjectMapper result = MyObjectMapper.getInstance();
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
}
