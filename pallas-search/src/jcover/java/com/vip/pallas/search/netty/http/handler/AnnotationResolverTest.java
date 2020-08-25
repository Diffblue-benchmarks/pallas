package com.vip.pallas.search.netty.http.handler;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.netty.http.handler.AnnotationResolver
 *
 * @author Diffblue Cover
 */

public class AnnotationResolverTest {

	@Test
	public void parseClassClazzIsNull() {
		AnnotationResolver.parseClass(null);
	}

	@Test
	public void parseClassClazzIsString() {
		AnnotationResolver.parseClass(String.class);
	}
}
