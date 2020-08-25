package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.Cluster
 *
 * @author Diffblue Cover
 */

public class ClusterTest {

	@Test
	public void factory1() throws java.text.ParseException {
		Cluster cluster = new Cluster();
		cluster.setAccessiblePs("John Smith");
		cluster.setClientAddress(null);
		cluster.setClusterId("1234");
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setCreateTime(createTime);
		cluster.setDescription("some text");
		cluster.setHasPrivilege(false);
		cluster.setHttpAddress("/some/path.html");
		cluster.setId(1L);
		cluster.setMonitorLevel("boss");
		cluster.setRealClusters("John Smith");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setUpdateTime(updateTime);
		assertThat(cluster.getAccessiblePs(), is("John Smith"));
		assertThat(cluster.getClientAddress(), is(nullValue()));
		assertThat(cluster.getClusterId(), is("1234"));
		assertThat(cluster.getCreateTime(), sameInstance(createTime));
		assertThat(cluster.getDescription(), is("some text"));
		assertThat(cluster.getHttpAddress(), is("/some/path.html"));
		assertThat(cluster.getId(), is(1L));
		assertThat(cluster.getMonitorLevel(), is("boss"));
		assertThat(cluster.getRealClusters(), is("John Smith"));
		assertThat(cluster.getUpdateTime(), sameInstance(updateTime));
		assertThat(cluster.isHasPrivilege(), is(false));
	}

	@Test
	public void factory2() throws java.text.ParseException {
		Cluster cluster = new Cluster();
		cluster.setAccessiblePs("John Smith");
		cluster.setClientAddress("280 Broadway");
		cluster.setClusterId(null);
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setCreateTime(createTime);
		cluster.setDescription("some text");
		cluster.setHasPrivilege(false);
		cluster.setHttpAddress("/some/path.html");
		cluster.setId(1L);
		cluster.setMonitorLevel("boss");
		cluster.setRealClusters("John Smith");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setUpdateTime(updateTime);
		assertThat(cluster.getAccessiblePs(), is("John Smith"));
		assertThat(cluster.getClientAddress(), is("280 Broadway"));
		assertThat(cluster.getClusterId(), is(nullValue()));
		assertThat(cluster.getCreateTime(), sameInstance(createTime));
		assertThat(cluster.getDescription(), is("some text"));
		assertThat(cluster.getHttpAddress(), is("/some/path.html"));
		assertThat(cluster.getId(), is(1L));
		assertThat(cluster.getMonitorLevel(), is("boss"));
		assertThat(cluster.getRealClusters(), is("John Smith"));
		assertThat(cluster.getUpdateTime(), sameInstance(updateTime));
		assertThat(cluster.isHasPrivilege(), is(false));
	}

	@Test
	public void factory3() throws java.text.ParseException {
		Cluster cluster = new Cluster();
		cluster.setAccessiblePs("John Smith");
		cluster.setClientAddress("280 Broadway");
		cluster.setClusterId("1234");
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setCreateTime(createTime);
		cluster.setDescription(null);
		cluster.setHasPrivilege(false);
		cluster.setHttpAddress("/some/path.html");
		cluster.setId(1L);
		cluster.setMonitorLevel("boss");
		cluster.setRealClusters("John Smith");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setUpdateTime(updateTime);
		assertThat(cluster.getAccessiblePs(), is("John Smith"));
		assertThat(cluster.getClientAddress(), is("280 Broadway"));
		assertThat(cluster.getClusterId(), is("1234"));
		assertThat(cluster.getCreateTime(), sameInstance(createTime));
		assertThat(cluster.getDescription(), is(nullValue()));
		assertThat(cluster.getHttpAddress(), is("/some/path.html"));
		assertThat(cluster.getId(), is(1L));
		assertThat(cluster.getMonitorLevel(), is("boss"));
		assertThat(cluster.getRealClusters(), is("John Smith"));
		assertThat(cluster.getUpdateTime(), sameInstance(updateTime));
		assertThat(cluster.isHasPrivilege(), is(false));
	}

	@Test
	public void factory4() throws java.text.ParseException {
		Cluster cluster = new Cluster();
		cluster.setAccessiblePs("John Smith");
		cluster.setClientAddress("280 Broadway");
		cluster.setClusterId("1234");
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setCreateTime(createTime);
		cluster.setDescription("some text");
		cluster.setHasPrivilege(false);
		cluster.setHttpAddress(null);
		cluster.setId(1L);
		cluster.setMonitorLevel("boss");
		cluster.setRealClusters("John Smith");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setUpdateTime(updateTime);
		assertThat(cluster.getAccessiblePs(), is("John Smith"));
		assertThat(cluster.getClientAddress(), is("280 Broadway"));
		assertThat(cluster.getClusterId(), is("1234"));
		assertThat(cluster.getCreateTime(), sameInstance(createTime));
		assertThat(cluster.getDescription(), is("some text"));
		assertThat(cluster.getHttpAddress(), is(nullValue()));
		assertThat(cluster.getId(), is(1L));
		assertThat(cluster.getMonitorLevel(), is("boss"));
		assertThat(cluster.getRealClusters(), is("John Smith"));
		assertThat(cluster.getUpdateTime(), sameInstance(updateTime));
		assertThat(cluster.isHasPrivilege(), is(false));
	}

	@Test
	public void factory5() throws java.text.ParseException {
		Cluster cluster = new Cluster();
		cluster.setAccessiblePs("John Smith");
		cluster.setClientAddress("280 Broadway");
		cluster.setClusterId("1234");
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setCreateTime(createTime);
		cluster.setDescription("some text");
		cluster.setHasPrivilege(false);
		cluster.setHttpAddress("Cluster i");
		cluster.setId(1L);
		cluster.setMonitorLevel("boss");
		cluster.setRealClusters("John Smith");
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		cluster.setUpdateTime(updateTime);
		assertThat(cluster.getAccessiblePs(), is("John Smith"));
		assertThat(cluster.getClientAddress(), is("280 Broadway"));
		assertThat(cluster.getClusterId(), is("1234"));
		assertThat(cluster.getCreateTime(), sameInstance(createTime));
		assertThat(cluster.getDescription(), is("some text"));
		assertThat(cluster.getHttpAddress(), is("Cluster i"));
		assertThat(cluster.getId(), is(1L));
		assertThat(cluster.getMonitorLevel(), is("boss"));
		assertThat(cluster.getRealClusters(), is("John Smith"));
		assertThat(cluster.getUpdateTime(), sameInstance(updateTime));
		assertThat(cluster.isHasPrivilege(), is(false));
	}

	@Test
	public void isLogicalClusterReturnsFalse() {
		assertThat(new Cluster().isLogicalCluster(), is(false));
	}

	@Test
	public void isLogicalClusterReturnsTrue() {
		Cluster cluster = new Cluster();
		cluster.setRealClusters("John Smith");
		assertThat(cluster.isLogicalCluster(), is(true));
	}
}
