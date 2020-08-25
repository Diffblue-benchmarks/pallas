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
 * Unit tests for com.vip.pallas.search.model.IndexRouting
 *
 * @author Diffblue Cover
 */

public class IndexRoutingTest {

	@Test
	public void factory() throws java.text.ParseException {
		IndexRouting indexRouting = new IndexRouting();
		ArrayList<IndexRouting.RoutingCondition> conditionList =
			 new ArrayList<IndexRouting.RoutingCondition>();
		IndexRouting.RoutingCondition routingCondition =
			 new IndexRouting.RoutingCondition();
		routingCondition.setConditionRelation("1");
		IndexRouting.Condtion element = new IndexRouting.Condtion();
		element.setExprOp("DE");
		element.setParamName("name");
		element.setParamType("BASIC");
		element.setParamValue("data");
		IndexRouting.Condtion[] conditions = new IndexRouting.Condtion[] { element };
		routingCondition.setConditions(conditions);
		routingCondition.setEnable(false);
		routingCondition.setName("director");
		routingCondition.setPreference("hello");
		conditionList.add(routingCondition);
		indexRouting.setConditionList(conditionList);
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		indexRouting.setCreateTime(createTime);
		indexRouting.setId(1L);
		indexRouting.setIndexId(1L);
		indexRouting.setIndexName("Acme");
		indexRouting.setRoutingsInfo("hello");
		indexRouting.setType("BASIC");
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		indexRouting.setUpdateTime(updateTime);
		assertThat(indexRouting.getConditionList().size(), is(1));
		assertThat(indexRouting.getConditionList().get(0), sameInstance(routingCondition));
		assertThat(indexRouting.getCreateTime(), sameInstance(createTime));
		assertThat(indexRouting.getId(), is(1L));
		assertThat(indexRouting.getIndexId(), is(1L));
		assertThat(indexRouting.getIndexName(), is("Acme"));
		assertThat(indexRouting.getRoutingsInfo(), is("hello"));
		assertThat(indexRouting.getType(), is("BASIC"));
		assertThat(indexRouting.getUpdateTime(), sameInstance(updateTime));
	}

	@Test
	public void genDefault() throws java.text.ParseException, Exception {

		// arrange
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
		ArrayList<IndexRoutingTargetGroup> groups =
			 new ArrayList<IndexRoutingTargetGroup>();
		IndexRoutingTargetGroup indexRoutingTargetGroup =
			 new IndexRoutingTargetGroup();
		indexRoutingTargetGroup.setClusterLevel(1);
		indexRoutingTargetGroup.setClustersInfo("hello");
		indexRoutingTargetGroup.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		indexRoutingTargetGroup.setId(1L);
		indexRoutingTargetGroup.setIndexId(1L);
		indexRoutingTargetGroup.setIndexName("Acme");
		indexRoutingTargetGroup.setName("Acme");
		indexRoutingTargetGroup.setNodesInfo("hello");
		indexRoutingTargetGroup.setState(1);
		indexRoutingTargetGroup.setType("BASIC");
		indexRoutingTargetGroup.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		groups.add(indexRoutingTargetGroup);

		// act
		IndexRouting result = IndexRouting.genDefault(index, groups);

		// assert
		assertThat(result.getConditionList(), is(nullValue()));
		assertThat(Math.abs(result.getCreateTime().getTime()-new Date().getTime())<=10_000L, is(true));
		assertThat(result.getId(), is(nullValue()));
		assertThat(result.getIndexId(), is(1L));
		assertThat(result.getIndexName(), is("Acme"));
		assertThat(result.getRoutingsInfo(), is("[{\"name\":\"Default\",\"conditionRelation\":\"AND\",\"conditions\":[],\"preference\":null,\"targetGroups\":[{\"id\":1,\"weight\":1}],\"enable\":true}]"));
		assertThat(result.getType(), is(nullValue()));
		assertThat(result.getUpdateTime(), is(nullValue()));
	}

	@Test
	public void fromXContent() throws Exception {
		assertThat(IndexRouting.fromXContent(""), empty());
		assertThat(IndexRouting.fromXContent(null), empty());
	}

	@Test
	public void toXContent() throws Exception {
		ArrayList<IndexRouting.RoutingCondition> list =
			 new ArrayList<IndexRouting.RoutingCondition>();
		IndexRouting.RoutingCondition routingCondition =
			 new IndexRouting.RoutingCondition();
		routingCondition.setConditionRelation("1");
		IndexRouting.Condtion element = new IndexRouting.Condtion();
		element.setExprOp("DE");
		element.setParamName("name");
		element.setParamType("BASIC");
		element.setParamValue("data");
		IndexRouting.Condtion[] conditions = new IndexRouting.Condtion[] { element };
		routingCondition.setConditions(conditions);
		routingCondition.setName("director");
		routingCondition.setPreference("hello");
		list.add(routingCondition);
		assertThat(IndexRouting.toXContent(list), is("[{\"name\":\"director\",\"conditionRelation\":\"1\",\"conditions\":[{\"paramType\":\"BASIC\",\"paramName\":\"name\",\"paramValue\":\"data\",\"exprOp\":\"DE\"}],\"preference\":\"hello\",\"targetGroups\":null,\"enable\":false}]"));
	}
}
