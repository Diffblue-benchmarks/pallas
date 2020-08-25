package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.DataSource
 *
 * @author Diffblue Cover
 */

public class DataSourceTest {

	@Test
	public void factory1() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname(null);
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername("something");
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is(nullValue()));
		assertThat(dataSource.getDescription(), is("some text"));
		assertThat(dataSource.getId(), is(1L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is("something"));
		assertThat(dataSource.getPassword(), is("secret"));
		assertThat(dataSource.getPort(), is("OX13QD"));
		assertThat(dataSource.getTableName(), is("Acme"));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is("something"));
	}

	@Test
	public void factory2() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname("Acme");
		dataSource.setDescription(null);
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername("something");
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is("Acme"));
		assertThat(dataSource.getDescription(), is(nullValue()));
		assertThat(dataSource.getId(), is(1L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is("something"));
		assertThat(dataSource.getPassword(), is("secret"));
		assertThat(dataSource.getPort(), is("OX13QD"));
		assertThat(dataSource.getTableName(), is("Acme"));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is("something"));
	}

	@Test
	public void factory3() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(0L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername("something");
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is("Acme"));
		assertThat(dataSource.getDescription(), is("some text"));
		assertThat(dataSource.getId(), is(0L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is("something"));
		assertThat(dataSource.getPassword(), is("secret"));
		assertThat(dataSource.getPort(), is("OX13QD"));
		assertThat(dataSource.getTableName(), is("Acme"));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is("something"));
	}

	@Test
	public void factory4() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp(null);
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername("something");
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is("Acme"));
		assertThat(dataSource.getDescription(), is("some text"));
		assertThat(dataSource.getId(), is(1L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is(nullValue()));
		assertThat(dataSource.getPassword(), is("secret"));
		assertThat(dataSource.getPort(), is("OX13QD"));
		assertThat(dataSource.getTableName(), is("Acme"));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is("something"));
	}

	@Test
	public void factory5() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword(null);
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername("something");
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is("Acme"));
		assertThat(dataSource.getDescription(), is("some text"));
		assertThat(dataSource.getId(), is(1L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is("something"));
		assertThat(dataSource.getPassword(), is(nullValue()));
		assertThat(dataSource.getPort(), is("OX13QD"));
		assertThat(dataSource.getTableName(), is("Acme"));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is("something"));
	}

	@Test
	public void factory6() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort(null);
		dataSource.setTableName("Acme");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername("something");
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is("Acme"));
		assertThat(dataSource.getDescription(), is("some text"));
		assertThat(dataSource.getId(), is(1L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is("something"));
		assertThat(dataSource.getPassword(), is("secret"));
		assertThat(dataSource.getPort(), is(nullValue()));
		assertThat(dataSource.getTableName(), is("Acme"));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is("something"));
	}

	@Test
	public void factory7() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName(null);
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername("something");
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is("Acme"));
		assertThat(dataSource.getDescription(), is("some text"));
		assertThat(dataSource.getId(), is(1L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is("something"));
		assertThat(dataSource.getPassword(), is("secret"));
		assertThat(dataSource.getPort(), is("OX13QD"));
		assertThat(dataSource.getTableName(), is(nullValue()));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is("something"));
	}

	@Test
	public void factory8() throws java.text.ParseException {
		DataSource dataSource = new DataSource();
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setCreateTime(createTime);
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		dataSource.setUpdateTime(updateTime);
		dataSource.setUsername(null);
		assertThat(dataSource.getCreateTime(), sameInstance(createTime));
		assertThat(dataSource.getDbname(), is("Acme"));
		assertThat(dataSource.getDescription(), is("some text"));
		assertThat(dataSource.getId(), is(1L));
		assertThat(dataSource.getIndexId(), is(1L));
		assertThat(dataSource.getIp(), is("something"));
		assertThat(dataSource.getPassword(), is("secret"));
		assertThat(dataSource.getPort(), is("OX13QD"));
		assertThat(dataSource.getTableName(), is("Acme"));
		assertThat(dataSource.getUpdateTime(), sameInstance(updateTime));
		assertThat(dataSource.getUsername(), is(nullValue()));
	}

	@Test
	public void equalsReturnsTrue() {
		DataSource dataSource1 = new DataSource();
		dataSource1.setId(1L);
		DataSource dataSource2 = new DataSource();
		dataSource2.setId(1L);
		assertThat(dataSource1.equals(dataSource2), is(true));
	}
}
