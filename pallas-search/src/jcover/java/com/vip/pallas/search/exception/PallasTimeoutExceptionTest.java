package com.vip.pallas.search.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.exception.PallasTimeoutException
 *
 * @author Diffblue Cover
 */

public class PallasTimeoutExceptionTest {

	@Test
	public void factory1() {
		PallasTimeoutException pallasTimeoutException = new PallasTimeoutException();
		pallasTimeoutException.setMessage("an error has happened");
		assertThat(pallasTimeoutException.getMessage(), is("an error has happened"));
		assertThat(pallasTimeoutException.getCause(), is(nullValue()));
	}

	@Test
	public void factory2() {
		PallasTimeoutException pallasTimeoutException =
			 new PallasTimeoutException("an error has happened");
		pallasTimeoutException.setMessage("an error has happened");
		assertThat(pallasTimeoutException.getMessage(), is("an error has happened"));
		assertThat(pallasTimeoutException.getCause(), is(nullValue()));
	}
}
