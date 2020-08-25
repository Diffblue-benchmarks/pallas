package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.TemplateWithTimeoutRetry
 *
 * @author Diffblue Cover
 */

public class TemplateWithTimeoutRetryTest {

	@Test
	public void factory() {
		TemplateWithTimeoutRetry templateWithTimeoutRetry =
			 new TemplateWithTimeoutRetry();
		templateWithTimeoutRetry.setClusterName("John Smith");
		templateWithTimeoutRetry.setIndexId(1L);
		templateWithTimeoutRetry.setIndexName("Acme");
		templateWithTimeoutRetry.setRetry(1);
		templateWithTimeoutRetry.setTemplateId(1L);
		templateWithTimeoutRetry.setTemplateName("Acme");
		templateWithTimeoutRetry.setTimeout(1);
		assertThat(templateWithTimeoutRetry.getClusterName(), is("John Smith"));
		assertThat(templateWithTimeoutRetry.getIndexId(), is(1L));
		assertThat(templateWithTimeoutRetry.getIndexName(), is("Acme"));
		assertThat(templateWithTimeoutRetry.getRetry(), is(1));
		assertThat(templateWithTimeoutRetry.getTemplateId(), is(1L));
		assertThat(templateWithTimeoutRetry.getTemplateName(), is("Acme"));
		assertThat(templateWithTimeoutRetry.getTimeout(), is(1));
	}
}
