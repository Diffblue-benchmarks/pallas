package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.Node
 *
 * @author Diffblue Cover
 */

public class NodeTest {

	@Test
	public void factory1() throws java.text.ParseException {
		Node node = new Node();
		node.setClusterName(null);
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setCreateTime(createTime);
		node.setId(1L);
		node.setIsDeleted(false);
		Date lastStartupTime =
			 new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setLastStartupTime(lastStartupTime);
		node.setNodeIp("DE");
		node.setNodeName("Acme");
		node.setNote("DE");
		node.setState((byte) 1);
		Date stateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setStateTime(stateTime);
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setUpdateTime(updateTime);
		assertThat(node.getClusterName(), is(nullValue()));
		assertThat(node.getCreateTime(), sameInstance(createTime));
		assertThat(node.getId(), is(1L));
		assertThat(node.getIsDeleted(), is(false));
		assertThat(node.getLastStartupTime(), sameInstance(lastStartupTime));
		assertThat(node.getNodeIp(), is("DE"));
		assertThat(node.getNodeName(), is("Acme"));
		assertThat(node.getNote(), is("DE"));
		assertThat(node.getState(), is((byte) 1));
		assertThat(node.getStateTime(), sameInstance(stateTime));
		assertThat(node.getUpdateTime(), sameInstance(updateTime));
	}

	@Test
	public void factory2() throws java.text.ParseException {
		Node node = new Node();
		node.setClusterName("John Smith");
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setCreateTime(createTime);
		node.setId(1L);
		node.setIsDeleted(false);
		Date lastStartupTime =
			 new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setLastStartupTime(lastStartupTime);
		node.setNodeIp(null);
		node.setNodeName("Acme");
		node.setNote("DE");
		node.setState((byte) 1);
		Date stateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setStateTime(stateTime);
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setUpdateTime(updateTime);
		assertThat(node.getClusterName(), is("John Smith"));
		assertThat(node.getCreateTime(), sameInstance(createTime));
		assertThat(node.getId(), is(1L));
		assertThat(node.getIsDeleted(), is(false));
		assertThat(node.getLastStartupTime(), sameInstance(lastStartupTime));
		assertThat(node.getNodeIp(), is(nullValue()));
		assertThat(node.getNodeName(), is("Acme"));
		assertThat(node.getNote(), is("DE"));
		assertThat(node.getState(), is((byte) 1));
		assertThat(node.getStateTime(), sameInstance(stateTime));
		assertThat(node.getUpdateTime(), sameInstance(updateTime));
	}

	@Test
	public void factory3() throws java.text.ParseException {
		Node node = new Node();
		node.setClusterName("John Smith");
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setCreateTime(createTime);
		node.setId(1L);
		node.setIsDeleted(false);
		Date lastStartupTime =
			 new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setLastStartupTime(lastStartupTime);
		node.setNodeIp("bar");
		node.setNodeName("Acme");
		node.setNote("DE");
		node.setState((byte) 1);
		Date stateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setStateTime(stateTime);
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setUpdateTime(updateTime);
		assertThat(node.getClusterName(), is("John Smith"));
		assertThat(node.getCreateTime(), sameInstance(createTime));
		assertThat(node.getId(), is(1L));
		assertThat(node.getIsDeleted(), is(false));
		assertThat(node.getLastStartupTime(), sameInstance(lastStartupTime));
		assertThat(node.getNodeIp(), is("bar"));
		assertThat(node.getNodeName(), is("Acme"));
		assertThat(node.getNote(), is("DE"));
		assertThat(node.getState(), is((byte) 1));
		assertThat(node.getStateTime(), sameInstance(stateTime));
		assertThat(node.getUpdateTime(), sameInstance(updateTime));
	}

	@Test
	public void factory4() throws java.text.ParseException {
		Node node = new Node();
		node.setClusterName("John Smith");
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setCreateTime(createTime);
		node.setId(1L);
		node.setIsDeleted(false);
		Date lastStartupTime =
			 new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setLastStartupTime(lastStartupTime);
		node.setNodeIp("DE");
		node.setNodeName(null);
		node.setNote("DE");
		node.setState((byte) 1);
		Date stateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setStateTime(stateTime);
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setUpdateTime(updateTime);
		assertThat(node.getClusterName(), is("John Smith"));
		assertThat(node.getCreateTime(), sameInstance(createTime));
		assertThat(node.getId(), is(1L));
		assertThat(node.getIsDeleted(), is(false));
		assertThat(node.getLastStartupTime(), sameInstance(lastStartupTime));
		assertThat(node.getNodeIp(), is("DE"));
		assertThat(node.getNodeName(), is(nullValue()));
		assertThat(node.getNote(), is("DE"));
		assertThat(node.getState(), is((byte) 1));
		assertThat(node.getStateTime(), sameInstance(stateTime));
		assertThat(node.getUpdateTime(), sameInstance(updateTime));
	}

	@Test
	public void factory5() throws java.text.ParseException {
		Node node = new Node();
		node.setClusterName("John Smith");
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setCreateTime(createTime);
		node.setId(1L);
		node.setIsDeleted(false);
		Date lastStartupTime =
			 new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setLastStartupTime(lastStartupTime);
		node.setNodeIp("DE");
		node.setNodeName("Acme");
		node.setNote(null);
		node.setState((byte) 1);
		Date stateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setStateTime(stateTime);
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		node.setUpdateTime(updateTime);
		assertThat(node.getClusterName(), is("John Smith"));
		assertThat(node.getCreateTime(), sameInstance(createTime));
		assertThat(node.getId(), is(1L));
		assertThat(node.getIsDeleted(), is(false));
		assertThat(node.getLastStartupTime(), sameInstance(lastStartupTime));
		assertThat(node.getNodeIp(), is("DE"));
		assertThat(node.getNodeName(), is("Acme"));
		assertThat(node.getNote(), is(nullValue()));
		assertThat(node.getState(), is((byte) 1));
		assertThat(node.getStateTime(), sameInstance(stateTime));
		assertThat(node.getUpdateTime(), sameInstance(updateTime));
	}

	@Test
	public void isHealthyReturnsFalse() throws java.text.ParseException {
		Node node = new Node();
		node.setUpdateTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		assertThat(node.isHealthy(), is(false));
	}
}
