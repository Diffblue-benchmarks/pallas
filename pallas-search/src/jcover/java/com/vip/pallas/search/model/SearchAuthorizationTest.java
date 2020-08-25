package com.vip.pallas.search.model;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.SearchAuthorization
 *
 * @author Diffblue Cover
 */

public class SearchAuthorizationTest {

	@Test
	public void factory() throws java.text.ParseException {
		SearchAuthorization searchAuthorization = new SearchAuthorization();
		searchAuthorization.setAuthorizationItemList(new ArrayList<SearchAuthorization.AuthorizationItem>());
		searchAuthorization.setAuthorizationItems("password");
		searchAuthorization.setClientToken("Bearer");
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		searchAuthorization.setCreateTime(createTime);
		searchAuthorization.setEnabled(false);
		searchAuthorization.setId(1L);
		searchAuthorization.setTitle("Mr");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		searchAuthorization.setUpdateTime(updateTime);
		assertThat(searchAuthorization.getAuthorizationItems(), is("password"));
		assertThat(searchAuthorization.getClientToken(), is("Bearer"));
		assertThat(searchAuthorization.getCreateTime(), sameInstance(createTime));
		assertThat(searchAuthorization.getId(), is(1L));
		assertThat(searchAuthorization.getTitle(), is("Mr"));
		assertThat(searchAuthorization.getUpdateTime(), sameInstance(updateTime));
		assertThat(searchAuthorization.isEnabled(), is(false));
	}

	@Test
	public void getAuthorizationItemList() {
		SearchAuthorization searchAuthorization = new SearchAuthorization();
		ArrayList<SearchAuthorization.AuthorizationItem> authorizationItemList =
			 new ArrayList<SearchAuthorization.AuthorizationItem>();
		searchAuthorization.setAuthorizationItemList(authorizationItemList);
		assertThat(searchAuthorization.getAuthorizationItemList(), instanceOf(ArrayList.class));
		assertThat((ArrayList<SearchAuthorization.AuthorizationItem>) searchAuthorization.getAuthorizationItemList(), sameInstance(authorizationItemList));
	}

	@Test
	public void getAuthorizationItemListReturnsNull() {
		assertThat(new SearchAuthorization().getAuthorizationItemList(), is(nullValue()));
	}

	@Test
	public void toXContentCIsHello() throws Exception {
		assertThat(SearchAuthorization.<String>toXContent("hello"), is("\"hello\""));
	}
}
