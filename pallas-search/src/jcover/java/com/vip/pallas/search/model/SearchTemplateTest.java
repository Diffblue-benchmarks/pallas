package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.SearchTemplate
 *
 * @author Diffblue Cover
 */

public class SearchTemplateTest {

	@Test
	public void factory() throws java.text.ParseException {
		SearchTemplate searchTemplate = new SearchTemplate();
		searchTemplate.setApproving(true);
		searchTemplate.setContent("hello");
		searchTemplate.setDescription("some text");
		searchTemplate.setHisCount(0);
		searchTemplate.setId(1L);
		searchTemplate.setIndexId(1L);
		searchTemplate.setNewer(false);
		searchTemplate.setParams("data");
		searchTemplate.setRetry(1);
		searchTemplate.setTemplateName("Acme");
		searchTemplate.setTimeout(1);
		searchTemplate.setType(1);
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		searchTemplate.setUpdateTime(updateTime);
		assertThat(searchTemplate.getContent(), is("hello"));
		assertThat(searchTemplate.getDescription(), is("some text"));
		assertThat(searchTemplate.getHisCount(), is(0));
		assertThat(searchTemplate.getId(), is(1L));
		assertThat(searchTemplate.getIndexId(), is(1L));
		assertThat(searchTemplate.getParams(), is("data"));
		assertThat(searchTemplate.getRetry(), is(1));
		assertThat(searchTemplate.getTemplateName(), is("Acme"));
		assertThat(searchTemplate.getTimeout(), is(1));
		assertThat(searchTemplate.getType(), is(1));
		assertThat(searchTemplate.getUpdateTime(), sameInstance(updateTime));
		assertThat(searchTemplate.isApproving(), is(true));
		assertThat(searchTemplate.isNewer(), is(false));
	}
}
