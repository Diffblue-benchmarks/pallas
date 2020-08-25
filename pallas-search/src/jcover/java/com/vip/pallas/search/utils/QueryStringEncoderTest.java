package com.vip.pallas.search.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.utils.QueryStringEncoder
 *
 * @author Diffblue Cover
 */

public class QueryStringEncoderTest {

	@Test
	public void addParamNameIsName() {
		new QueryStringEncoder("bar").addParam("name", "foo=bar");
	}

	@Test
	public void toUri() throws java.net.URISyntaxException {
		assertThat(new QueryStringEncoder("bar").toUri().toString(), is("bar"));
	}
}
