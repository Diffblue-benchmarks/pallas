package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.IndexRoutingTargetGroup
 *
 * @author Diffblue Cover
 */

public class IndexRoutingTargetGroupTest {

	@Test
	public void factory() throws java.text.ParseException {
		IndexRoutingTargetGroup indexRoutingTargetGroup =
			 new IndexRoutingTargetGroup();
		ArrayList<IndexRoutingTargetGroup.ClusterInfo> clusterInfoList =
			 new ArrayList<IndexRoutingTargetGroup.ClusterInfo>();
		IndexRoutingTargetGroup.ClusterInfo clusterInfo =
			 new IndexRoutingTargetGroup.ClusterInfo();
		clusterInfo.setAddress("280 Broadway");
		clusterInfo.setCluster("John Smith");
		clusterInfo.setName("John Smith");
		clusterInfoList.add(clusterInfo);
		indexRoutingTargetGroup.setClusterInfoList(clusterInfoList);
		indexRoutingTargetGroup.setClusterLevel(1);
		indexRoutingTargetGroup.setClustersInfo("hello");
		Date createTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		indexRoutingTargetGroup.setCreateTime(createTime);
		indexRoutingTargetGroup.setId(1L);
		indexRoutingTargetGroup.setIndexId(1L);
		indexRoutingTargetGroup.setIndexName("Acme");
		indexRoutingTargetGroup.setName("Acme");
		ArrayList<IndexRoutingTargetGroup.NodeInfo> nodeInfoList =
			 new ArrayList<IndexRoutingTargetGroup.NodeInfo>();
		IndexRoutingTargetGroup.NodeInfo nodeInfo =
			 new IndexRoutingTargetGroup.NodeInfo();
		nodeInfo.setAddress("280 Broadway");
		nodeInfo.setCluster("John Smith");
		nodeInfo.setName("Acme");
		nodeInfo.setState(1);
		nodeInfo.setWeight(1);
		nodeInfoList.add(nodeInfo);
		indexRoutingTargetGroup.setNodeInfoList(nodeInfoList);
		indexRoutingTargetGroup.setNodesInfo("hello");
		ArrayList<ShardGroup> shardGroupList = new ArrayList<ShardGroup>();
		ArrayList<String> ipAndPortList = new ArrayList<String>();
		ipAndPortList.add("Smith");
		ShardGroup shardGroup = new ShardGroup("Smith", ipAndPortList, "Smith");
		shardGroup.setId("1234");
		shardGroup.setIndexName("Acme");
		shardGroup.setPreferNodes("foo");
		ArrayList<String> serverList = new ArrayList<String>();
		serverList.add("foo=bar");
		shardGroup.setServerList(serverList);
		shardGroupList.add(shardGroup);
		indexRoutingTargetGroup.setShardGroupList(shardGroupList);
		indexRoutingTargetGroup.setState(1);
		indexRoutingTargetGroup.setType("BASIC");
		Date updateTime = new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		indexRoutingTargetGroup.setUpdateTime(updateTime);
		assertThat(indexRoutingTargetGroup.getClusterInfoList().size(), is(1));
		assertThat(indexRoutingTargetGroup.getClusterInfoList().get(0), sameInstance(clusterInfo));
		assertThat(indexRoutingTargetGroup.getClusterLevel(), is(1));
		assertThat(indexRoutingTargetGroup.getClustersInfo(), is("hello"));
		assertThat(indexRoutingTargetGroup.getCreateTime(), sameInstance(createTime));
		assertThat(indexRoutingTargetGroup.getId(), is(1L));
		assertThat(indexRoutingTargetGroup.getIndexId(), is(1L));
		assertThat(indexRoutingTargetGroup.getIndexName(), is("Acme"));
		assertThat(indexRoutingTargetGroup.getName(), is("Acme"));
		assertThat(indexRoutingTargetGroup.getNodeInfoList().size(), is(1));
		assertThat(indexRoutingTargetGroup.getNodeInfoList().get(0), sameInstance(nodeInfo));
		assertThat(indexRoutingTargetGroup.getNodesInfo(), is("hello"));
		assertThat(indexRoutingTargetGroup.getShardGroupList().size(), is(1));
		assertThat(indexRoutingTargetGroup.getShardGroupList().get(0), sameInstance(shardGroup));
		assertThat(indexRoutingTargetGroup.getState(), is(1));
		assertThat(indexRoutingTargetGroup.getType(), is("BASIC"));
		assertThat(indexRoutingTargetGroup.getUpdateTime(), sameInstance(updateTime));
		assertThat(indexRoutingTargetGroup.isClusterLevel0(), is(true));
		assertThat(indexRoutingTargetGroup.isClusterPrimaryFirstLevel(), is(false));
		assertThat(indexRoutingTargetGroup.isClusterReplicaFirstLevel(), is(false));
		assertThat(indexRoutingTargetGroup.isGroupLevel(), is(false));
		assertThat(indexRoutingTargetGroup.isNormalLevel(), is(false));
		assertThat(indexRoutingTargetGroup.isShardLevel(), is(false));
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
		ArrayList<Cluster> clusters = new ArrayList<Cluster>();
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
		clusters.add(cluster);

		// act
		List<IndexRoutingTargetGroup> result =
			 IndexRoutingTargetGroup.genDefault(index, clusters);

		// assert
		assertThat(result.size(), is(1));
		assertThat(result.get(0).getClusterInfoList(), is(nullValue()));
		assertThat(result.get(0).getClusterLevel(), is(2));
		assertThat(result.get(0).getClustersInfo(), is("[{\"cluster\":\"1234\",\"name\":\"1234\",\"address\":\"/some/path.html\"}]"));
		assertThat(Math.abs(result.get(0).getCreateTime().getTime()-new Date().getTime())<=10_000L, is(true));
		assertThat(result.get(0).getId(), is(nullValue()));
		assertThat(result.get(0).getIndexId(), is(1L));
		assertThat(result.get(0).getIndexName(), is("Acme"));
		assertThat(result.get(0).getName(), is("Default"));
		assertThat(result.get(0).getNodeInfoList(), is(nullValue()));
		assertThat(result.get(0).getNodesInfo(), is("[]"));
		assertThat(result.get(0).getShardGroupList(), is(nullValue()));
		assertThat(result.get(0).getState(), is(0));
		assertThat(result.get(0).getType(), is(nullValue()));
		assertThat(result.get(0).getUpdateTime(), is(nullValue()));
		assertThat(result.get(0).isClusterLevel0(), is(false));
		assertThat(result.get(0).isClusterPrimaryFirstLevel(), is(false));
		assertThat(result.get(0).isClusterReplicaFirstLevel(), is(false));
		assertThat(result.get(0).isGroupLevel(), is(false));
		assertThat(result.get(0).isNormalLevel(), is(false));
		assertThat(result.get(0).isShardLevel(), is(true));
	}

	@Test
	public void fromXContent() throws Exception {
		assertThat(IndexRoutingTargetGroup.fromXContent(""), empty());
		assertThat(IndexRoutingTargetGroup.fromXContent(null), empty());
	}

	@Test
	public void fromClusterContent() throws Exception {
		assertThat(IndexRoutingTargetGroup.fromClusterContent(""), empty());
		assertThat(IndexRoutingTargetGroup.fromClusterContent(null), empty());
	}

	@Test
	public void toXContentNodeInfosIsHello() throws Exception {
		ArrayList<String> nodeInfos = new ArrayList<String>();
		nodeInfos.add("hello");
		assertThat(IndexRoutingTargetGroup.<String>toXContent(nodeInfos), is("[\"hello\"]"));
	}
}
