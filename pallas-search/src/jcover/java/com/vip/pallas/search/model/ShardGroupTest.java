package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.ShardGroup
 *
 * @author Diffblue Cover
 */

public class ShardGroupTest {

	@Test
	public void factory() {
		ArrayList<String> ipAndPortList = new ArrayList<String>();
		ipAndPortList.add("foo");
		ShardGroup shardGroup = new ShardGroup("foo", ipAndPortList, "Acme");
		shardGroup.setId("1234");
		shardGroup.setIndexName("Acme");
		shardGroup.setPreferNodes("foo");
		ArrayList<String> serverList = new ArrayList<String>();
		serverList.add("foo=bar");
		shardGroup.setServerList(serverList);
		assertThat(shardGroup.getId(), is("1234"));
		assertThat(shardGroup.getIndexName(), is("Acme"));
		assertThat(shardGroup.getPreferNodes(), is("foo"));
		assertThat(shardGroup.getServerList(), hasSize(1));
		assertThat(shardGroup.getServerList().get(0), is("foo=bar"));
	}
}
