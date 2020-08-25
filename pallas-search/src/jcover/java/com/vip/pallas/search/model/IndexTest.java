package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.Index
 *
 * @author Diffblue Cover
 */

public class IndexTest {

	@Test
	public void factory1() throws java.text.ParseException {
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName(null);
		Date createTime1 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setCreateTime(createTime1);
		index.setCreateUser("John Smith");
		ArrayList<DataSource> dataSourceList = new ArrayList<DataSource>();
		DataSource dataSource = new DataSource();
		dataSource.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		dataSource.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setUsername("something");
		dataSourceList.add(dataSource);
		index.setDataSourceList(dataSourceList);
		index.setDescription("some text");
		index.setHasClusterPrivilege(false);
		index.setHasPrivilege(false);
		index.setHttpAddress("/some/path.html");
		index.setId(1L);
		index.setIndexName("Acme");
		index.setRetry(1);
		index.setSlowerThan(1);
		index.setStat("New York");
		index.setTimeout(1);
		Date updateTime2 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setUpdateTime(updateTime2);
		assertThat(index.getClusterDesc(), is("John Smith"));
		assertThat(index.getClusterName(), is(nullValue()));
		assertThat(index.getCreateTime(), sameInstance(createTime1));
		assertThat(index.getCreateUser(), is("John Smith"));
		assertThat(index.getDataSourceList().size(), is(1));
		assertThat(index.getDataSourceList().get(0), sameInstance(dataSource));
		assertThat(index.getDescription(), is("some text"));
		assertThat(index.getHttpAddress(), is("/some/path.html"));
		assertThat(index.getId(), is(1L));
		assertThat(index.getIndexName(), is("Acme"));
		assertThat(index.getRetry(), is(1));
		assertThat(index.getSlowerThan(), is(1));
		assertThat(index.getStat(), is("New York"));
		assertThat(index.getTimeout(), is(1));
		assertThat(index.getUpdateTime(), sameInstance(updateTime2));
		assertThat(index.isHasClusterPrivilege(), is(false));
		assertThat(index.isHasPrivilege(), is(false));
	}

	@Test
	public void factory2() throws java.text.ParseException {
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName("John Smith");
		Date createTime1 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setCreateTime(createTime1);
		index.setCreateUser(null);
		ArrayList<DataSource> dataSourceList = new ArrayList<DataSource>();
		DataSource dataSource = new DataSource();
		dataSource.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		dataSource.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setUsername("something");
		dataSourceList.add(dataSource);
		index.setDataSourceList(dataSourceList);
		index.setDescription("some text");
		index.setHasClusterPrivilege(false);
		index.setHasPrivilege(false);
		index.setHttpAddress("/some/path.html");
		index.setId(1L);
		index.setIndexName("Acme");
		index.setRetry(1);
		index.setSlowerThan(1);
		index.setStat("New York");
		index.setTimeout(1);
		Date updateTime2 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setUpdateTime(updateTime2);
		assertThat(index.getClusterDesc(), is("John Smith"));
		assertThat(index.getClusterName(), is("John Smith"));
		assertThat(index.getCreateTime(), sameInstance(createTime1));
		assertThat(index.getCreateUser(), is(nullValue()));
		assertThat(index.getDataSourceList().size(), is(1));
		assertThat(index.getDataSourceList().get(0), sameInstance(dataSource));
		assertThat(index.getDescription(), is("some text"));
		assertThat(index.getHttpAddress(), is("/some/path.html"));
		assertThat(index.getId(), is(1L));
		assertThat(index.getIndexName(), is("Acme"));
		assertThat(index.getRetry(), is(1));
		assertThat(index.getSlowerThan(), is(1));
		assertThat(index.getStat(), is("New York"));
		assertThat(index.getTimeout(), is(1));
		assertThat(index.getUpdateTime(), sameInstance(updateTime2));
		assertThat(index.isHasClusterPrivilege(), is(false));
		assertThat(index.isHasPrivilege(), is(false));
	}

	@Test
	public void factory3() throws java.text.ParseException {
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName("John Smith");
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setCreateTime(createTime);
		index.setCreateUser("John Smith");
		index.setDataSourceList(new ArrayList<DataSource>());
		index.setDescription("some text");
		index.setHasClusterPrivilege(false);
		index.setHasPrivilege(false);
		index.setHttpAddress("/some/path.html");
		index.setId(1L);
		index.setIndexName("Acme");
		index.setRetry(1);
		index.setSlowerThan(1);
		index.setStat("New York");
		index.setTimeout(1);
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setUpdateTime(updateTime);
		assertThat(index.getClusterDesc(), is("John Smith"));
		assertThat(index.getClusterName(), is("John Smith"));
		assertThat(index.getCreateTime(), sameInstance(createTime));
		assertThat(index.getCreateUser(), is("John Smith"));
		assertThat(index.getDataSourceList(), empty());
		assertThat(index.getDescription(), is("some text"));
		assertThat(index.getHttpAddress(), is("/some/path.html"));
		assertThat(index.getId(), is(1L));
		assertThat(index.getIndexName(), is("Acme"));
		assertThat(index.getRetry(), is(1));
		assertThat(index.getSlowerThan(), is(1));
		assertThat(index.getStat(), is("New York"));
		assertThat(index.getTimeout(), is(1));
		assertThat(index.getUpdateTime(), sameInstance(updateTime));
		assertThat(index.isHasClusterPrivilege(), is(false));
		assertThat(index.isHasPrivilege(), is(false));
	}

	@Test
	public void factory4() throws java.text.ParseException {
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName("John Smith");
		Date createTime1 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setCreateTime(createTime1);
		index.setCreateUser("John Smith");
		ArrayList<DataSource> dataSourceList = new ArrayList<DataSource>();
		DataSource dataSource = new DataSource();
		dataSource.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		dataSource.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setUsername("something");
		dataSourceList.add(dataSource);
		index.setDataSourceList(dataSourceList);
		index.setDescription(null);
		index.setHasClusterPrivilege(false);
		index.setHasPrivilege(false);
		index.setHttpAddress("/some/path.html");
		index.setId(1L);
		index.setIndexName("Acme");
		index.setRetry(1);
		index.setSlowerThan(1);
		index.setStat("New York");
		index.setTimeout(1);
		Date updateTime2 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setUpdateTime(updateTime2);
		assertThat(index.getClusterDesc(), is("John Smith"));
		assertThat(index.getClusterName(), is("John Smith"));
		assertThat(index.getCreateTime(), sameInstance(createTime1));
		assertThat(index.getCreateUser(), is("John Smith"));
		assertThat(index.getDataSourceList().size(), is(1));
		assertThat(index.getDataSourceList().get(0), sameInstance(dataSource));
		assertThat(index.getDescription(), is(nullValue()));
		assertThat(index.getHttpAddress(), is("/some/path.html"));
		assertThat(index.getId(), is(1L));
		assertThat(index.getIndexName(), is("Acme"));
		assertThat(index.getRetry(), is(1));
		assertThat(index.getSlowerThan(), is(1));
		assertThat(index.getStat(), is("New York"));
		assertThat(index.getTimeout(), is(1));
		assertThat(index.getUpdateTime(), sameInstance(updateTime2));
		assertThat(index.isHasClusterPrivilege(), is(false));
		assertThat(index.isHasPrivilege(), is(false));
	}

	@Test
	public void factory5() throws java.text.ParseException {
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName("John Smith");
		Date createTime1 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setCreateTime(createTime1);
		index.setCreateUser("John Smith");
		ArrayList<DataSource> dataSourceList = new ArrayList<DataSource>();
		DataSource dataSource = new DataSource();
		dataSource.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		dataSource.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setUsername("something");
		dataSourceList.add(dataSource);
		index.setDataSourceList(dataSourceList);
		index.setDescription("some text");
		index.setHasClusterPrivilege(false);
		index.setHasPrivilege(false);
		index.setHttpAddress("/some/path.html");
		index.setId(1L);
		index.setIndexName(null);
		index.setRetry(1);
		index.setSlowerThan(1);
		index.setStat("New York");
		index.setTimeout(1);
		Date updateTime2 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setUpdateTime(updateTime2);
		assertThat(index.getClusterDesc(), is("John Smith"));
		assertThat(index.getClusterName(), is("John Smith"));
		assertThat(index.getCreateTime(), sameInstance(createTime1));
		assertThat(index.getCreateUser(), is("John Smith"));
		assertThat(index.getDataSourceList().size(), is(1));
		assertThat(index.getDataSourceList().get(0), sameInstance(dataSource));
		assertThat(index.getDescription(), is("some text"));
		assertThat(index.getHttpAddress(), is("/some/path.html"));
		assertThat(index.getId(), is(1L));
		assertThat(index.getIndexName(), is(nullValue()));
		assertThat(index.getRetry(), is(1));
		assertThat(index.getSlowerThan(), is(1));
		assertThat(index.getStat(), is("New York"));
		assertThat(index.getTimeout(), is(1));
		assertThat(index.getUpdateTime(), sameInstance(updateTime2));
		assertThat(index.isHasClusterPrivilege(), is(false));
		assertThat(index.isHasPrivilege(), is(false));
	}

	@Test
	public void factory6() throws java.text.ParseException {
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName("John Smith");
		Date createTime1 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setCreateTime(createTime1);
		index.setCreateUser("John Smith");
		ArrayList<DataSource> dataSourceList = new ArrayList<DataSource>();
		DataSource dataSource = new DataSource();
		dataSource.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setDbname("Acme");
		dataSource.setDescription("some text");
		dataSource.setId(1L);
		dataSource.setIndexId(1L);
		dataSource.setIp("something");
		dataSource.setPassword("secret");
		dataSource.setPort("OX13QD");
		dataSource.setTableName("Acme");
		dataSource.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		dataSource.setUsername("something");
		dataSourceList.add(dataSource);
		index.setDataSourceList(dataSourceList);
		index.setDescription("some text");
		index.setHasClusterPrivilege(false);
		index.setHasPrivilege(false);
		index.setHttpAddress("/some/path.html");
		index.setId(1L);
		index.setIndexName("Acme");
		index.setRetry(1);
		index.setSlowerThan(1);
		index.setStat(null);
		index.setTimeout(1);
		Date updateTime2 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		index.setUpdateTime(updateTime2);
		assertThat(index.getClusterDesc(), is("John Smith"));
		assertThat(index.getClusterName(), is("John Smith"));
		assertThat(index.getCreateTime(), sameInstance(createTime1));
		assertThat(index.getCreateUser(), is("John Smith"));
		assertThat(index.getDataSourceList().size(), is(1));
		assertThat(index.getDataSourceList().get(0), sameInstance(dataSource));
		assertThat(index.getDescription(), is("some text"));
		assertThat(index.getHttpAddress(), is("/some/path.html"));
		assertThat(index.getId(), is(1L));
		assertThat(index.getIndexName(), is("Acme"));
		assertThat(index.getRetry(), is(1));
		assertThat(index.getSlowerThan(), is(1));
		assertThat(index.getStat(), is(nullValue()));
		assertThat(index.getTimeout(), is(1));
		assertThat(index.getUpdateTime(), sameInstance(updateTime2));
		assertThat(index.isHasClusterPrivilege(), is(false));
		assertThat(index.isHasPrivilege(), is(false));
	}
}
