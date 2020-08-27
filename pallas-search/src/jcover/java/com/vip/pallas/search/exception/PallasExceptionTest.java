package com.vip.pallas.search.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.exception.PallasException
 *
 * @author Diffblue Cover
 */

public class PallasExceptionTest {

	@Test
	public void factory1() {
		PallasException pallasException = new PallasException("DE");
		pallasException.setErrorCode("DE");
		pallasException.setMessage("an error has happened");
		assertThat(pallasException.getErrorCode(), is("DE"));
		assertThat(pallasException.getMessage(), is("an error has happened"));
		assertThat(pallasException.getCause(), is(nullValue()));
	}

	@Test
	public void factory2() {
		PallasException pallasException =
			 new PallasException("an error has happened", "DE");
		pallasException.setErrorCode("DE");
		pallasException.setMessage("an error has happened");
		assertThat(pallasException.getErrorCode(), is("DE"));
		assertThat(pallasException.getMessage(), is("an error has happened"));
		assertThat(pallasException.getCause(), is(nullValue()));
	}

	@Test
	public void factory3() {
		Exception cause = new Exception();
		cause.setStackTrace(new StackTraceElement[] { });
		PallasException pallasException =
			 new PallasException("an error has happened", "DE", cause);
		pallasException.setErrorCode("DE");
		pallasException.setMessage("an error has happened");
		assertThat(pallasException.getErrorCode(), is("DE"));
		assertThat(pallasException.getMessage(), is("an error has happened"));
		assertThat(pallasException.getCause().getCause(), is(nullValue()));
		assertThat(pallasException.getCause().getMessage(), is(nullValue()));
	}

	@Test
	public void factory4() {
		Exception cause = new Exception();
		cause.setStackTrace(new StackTraceElement[] { });
		PallasException pallasException = new PallasException("DE", cause);
		pallasException.setErrorCode("DE");
		pallasException.setMessage("an error has happened");
		assertThat(pallasException.getErrorCode(), is("DE"));
		assertThat(pallasException.getMessage(), is("an error has happened"));
		assertThat(pallasException.getCause().getCause(), is(nullValue()));
		assertThat(pallasException.getCause().getMessage(), is(nullValue()));
	}
}
