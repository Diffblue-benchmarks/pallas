package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.hamcrest.number.IsCloseTo.closeTo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.FlowRecordConfig
 *
 * @author Diffblue Cover
 */

public class FlowRecordConfigTest {

	@Test
	public void factory1() throws java.text.ParseException {
		FlowRecordConfig flowRecordConfig = new FlowRecordConfig();
		Cluster cluster = new Cluster();
		cluster.setAccessiblePs("John Smith");
		cluster.setClientAddress("280 Broadway");
		cluster.setClusterId("1234");
		cluster.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		cluster.setDescription("some text");
		cluster.setHasPrivilege(false);
		cluster.setHttpAddress("/some/path.html");
		cluster.setId(1L);
		cluster.setMonitorLevel("boss");
		cluster.setRealClusters("John Smith");
		cluster.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		flowRecordConfig.setCluster(cluster);
		Date createTime2 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setCreateTime(createTime2);
		flowRecordConfig.setCreateUser(null);
		Date endTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setEndTime(endTime);
		flowRecordConfig.setHasPrivilege(false);
		flowRecordConfig.setId(1L);
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName("John Smith");
		index.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
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
		dataSource.setUsername("root");
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
		index.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		flowRecordConfig.setIndex(index);
		flowRecordConfig.setIndexId(1L);
		flowRecordConfig.setIsDeleted(false);
		flowRecordConfig.setIsEnable(false);
		flowRecordConfig.setLimit(1L);
		flowRecordConfig.setNote("foo");
		flowRecordConfig.setSampleRate(1.0);
		Date startTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setStartTime(startTime);
		SearchTemplate template = new SearchTemplate();
		template.setApproving(false);
		template.setContent("hello");
		template.setDescription("some text");
		template.setHisCount(1);
		template.setId(1L);
		template.setIndexId(1L);
		template.setNewer(false);
		template.setParams("data");
		template.setRetry(1);
		template.setTemplateName("Acme");
		template.setTimeout(1);
		template.setType(1);
		template.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		flowRecordConfig.setTemplate(template);
		flowRecordConfig.setTemplateId(1L);
		Date updateTime5 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setUpdateTime(updateTime5);
		assertThat(flowRecordConfig.getCluster(), sameInstance(cluster));
		assertThat(flowRecordConfig.getCreateTime(), sameInstance(createTime2));
		assertThat(flowRecordConfig.getCreateUser(), is(nullValue()));
		assertThat(flowRecordConfig.getEndTime(), sameInstance(endTime));
		assertThat(flowRecordConfig.getId(), is(1L));
		assertThat(flowRecordConfig.getIndex(), sameInstance(index));
		assertThat(flowRecordConfig.getIndexId(), is(1L));
		assertThat(flowRecordConfig.getIsDeleted(), is(false));
		assertThat(flowRecordConfig.getIsEnable(), is(false));
		assertThat(flowRecordConfig.getLimit(), is(1L));
		assertThat(flowRecordConfig.getNote(), is("foo"));
		assertThat(flowRecordConfig.getSampleRate(), closeTo(1.0, 0.0));
		assertThat(flowRecordConfig.getStartTime(), sameInstance(startTime));
		assertThat(flowRecordConfig.getTemplate(), sameInstance(template));
		assertThat(flowRecordConfig.getTemplateId(), is(1L));
		assertThat(flowRecordConfig.getUpdateTime(), sameInstance(updateTime5));
		assertThat(flowRecordConfig.isHasPrivilege(), is(false));
	}

	@Test
	public void factory2() throws java.text.ParseException {
		FlowRecordConfig flowRecordConfig = new FlowRecordConfig();
		Cluster cluster = new Cluster();
		cluster.setAccessiblePs("John Smith");
		cluster.setClientAddress("280 Broadway");
		cluster.setClusterId("1234");
		cluster.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		cluster.setDescription("some text");
		cluster.setHasPrivilege(false);
		cluster.setHttpAddress("/some/path.html");
		cluster.setId(1L);
		cluster.setMonitorLevel("boss");
		cluster.setRealClusters("John Smith");
		cluster.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		flowRecordConfig.setCluster(cluster);
		Date createTime2 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setCreateTime(createTime2);
		flowRecordConfig.setCreateUser("John Smith");
		Date endTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setEndTime(endTime);
		flowRecordConfig.setHasPrivilege(false);
		flowRecordConfig.setId(1L);
		Index index = new Index();
		index.setClusterDesc("John Smith");
		index.setClusterName("John Smith");
		index.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
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
		index.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		flowRecordConfig.setIndex(index);
		flowRecordConfig.setIndexId(1L);
		flowRecordConfig.setIsDeleted(false);
		flowRecordConfig.setIsEnable(false);
		flowRecordConfig.setLimit(1L);
		flowRecordConfig.setNote("foo");
		flowRecordConfig.setSampleRate(1.0);
		Date startTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setStartTime(startTime);
		SearchTemplate template = new SearchTemplate();
		template.setApproving(false);
		template.setContent("hello");
		template.setDescription("some text");
		template.setHisCount(1);
		template.setId(1L);
		template.setIndexId(1L);
		template.setNewer(false);
		template.setParams("data");
		template.setRetry(1);
		template.setTemplateName("Acme");
		template.setTimeout(1);
		template.setType(1);
		template.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		flowRecordConfig.setTemplate(template);
		flowRecordConfig.setTemplateId(1L);
		Date updateTime4 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecordConfig.setUpdateTime(updateTime4);
		assertThat(flowRecordConfig.getCluster(), sameInstance(cluster));
		assertThat(flowRecordConfig.getCreateTime(), sameInstance(createTime2));
		assertThat(flowRecordConfig.getCreateUser(), is("John Smith"));
		assertThat(flowRecordConfig.getEndTime(), sameInstance(endTime));
		assertThat(flowRecordConfig.getId(), is(1L));
		assertThat(flowRecordConfig.getIndex(), sameInstance(index));
		assertThat(flowRecordConfig.getIndexId(), is(1L));
		assertThat(flowRecordConfig.getIsDeleted(), is(false));
		assertThat(flowRecordConfig.getIsEnable(), is(false));
		assertThat(flowRecordConfig.getLimit(), is(1L));
		assertThat(flowRecordConfig.getNote(), is("foo"));
		assertThat(flowRecordConfig.getSampleRate(), closeTo(1.0, 0.0));
		assertThat(flowRecordConfig.getStartTime(), sameInstance(startTime));
		assertThat(flowRecordConfig.getTemplate(), sameInstance(template));
		assertThat(flowRecordConfig.getTemplateId(), is(1L));
		assertThat(flowRecordConfig.getUpdateTime(), sameInstance(updateTime4));
		assertThat(flowRecordConfig.isHasPrivilege(), is(false));
	}
}
