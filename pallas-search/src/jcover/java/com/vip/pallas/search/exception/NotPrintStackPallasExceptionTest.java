package com.vip.pallas.search.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.exception.NotPrintStackPallasException
 *
 * @author Diffblue Cover
 */

public class NotPrintStackPallasExceptionTest {

	@Test
	public void factory() {
		NotPrintStackPallasException notPrintStackPallasException =
			 new NotPrintStackPallasException("an error has happened", "DE", "Acme", "GET");
		notPrintStackPallasException.setErrorCode("DE");
		notPrintStackPallasException.setMessage("an error has happened");
		assertThat(notPrintStackPallasException.getErrorCode(), is("DE"));
		assertThat(notPrintStackPallasException.getMessage(), is("an error has happened"));
		assertThat(notPrintStackPallasException.getCause(), is(nullValue()));
	}
}
