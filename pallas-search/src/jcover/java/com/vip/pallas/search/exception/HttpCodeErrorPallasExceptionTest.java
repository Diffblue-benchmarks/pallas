package com.vip.pallas.search.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.exception.HttpCodeErrorPallasException
 *
 * @author Diffblue Cover
 */

public class HttpCodeErrorPallasExceptionTest {

	@Test
	public void factory() {
		HttpCodeErrorPallasException httpCodeErrorPallasException =
			 new HttpCodeErrorPallasException("bar", 1, "Acme", "GET");
		httpCodeErrorPallasException.setErrorCode("DE");
		httpCodeErrorPallasException.setMessage("foo");
		assertThat(httpCodeErrorPallasException.getHttpCode(), is(1));
		assertThat(httpCodeErrorPallasException.getErrorCode(), is("DE"));
		assertThat(httpCodeErrorPallasException.getMessage(), is("foo"));
		assertThat(httpCodeErrorPallasException.getCause(), is(nullValue()));
	}
}
