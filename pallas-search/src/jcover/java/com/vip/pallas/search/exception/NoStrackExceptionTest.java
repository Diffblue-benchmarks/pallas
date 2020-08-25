package com.vip.pallas.search.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.exception.NoStrackException
 *
 * @author Diffblue Cover
 */

public class NoStrackExceptionTest {

	@Test
	public void factory() {
		NoStrackException noStrackException =
			 new NoStrackException("an error has happened", "DE", "Acme", "GET");
		noStrackException.setErrorCode("DE");
		noStrackException.setMessage("an error has happened");
		assertThat(noStrackException.getErrorCode(), is("DE"));
		assertThat(noStrackException.getMessage(), is("an error has happened"));
		assertThat(noStrackException.getCause(), is(nullValue()));
	}
}
