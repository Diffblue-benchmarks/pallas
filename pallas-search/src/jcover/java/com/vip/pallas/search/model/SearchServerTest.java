package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashSet;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.SearchServer
 *
 * @author Diffblue Cover
 */

public class SearchServerTest {

	@Test
	public void factory1() {
		SearchServer searchServer = new SearchServer(false, new Object());
		searchServer.setCluster("John Smith");
		Object info2 = new Object();
		searchServer.setInfo(info2);
		searchServer.setIpport("/some/path.html");
		searchServer.setPools(new HashSet<String>());
		searchServer.setTakeTraffic(false);
		assertThat(searchServer.getCluster(), is("John Smith"));
		assertThat(searchServer.getInfo(), sameInstance(info2));
		assertThat(searchServer.getIpport(), is("/some/path.html"));
		assertThat(searchServer.getPools(), empty());
		assertThat(searchServer.getTakeTraffic(), is(false));
	}

	@Test
	public void factory2() {
		SearchServer searchServer =
			 new SearchServer("John Smith", "foo", "", false, new Object());
		searchServer.setCluster("John Smith");
		Object info2 = new Object();
		searchServer.setInfo(info2);
		searchServer.setIpport("/some/path.html");
		searchServer.setPools(new HashSet<String>());
		searchServer.setTakeTraffic(false);
		assertThat(searchServer.getCluster(), is("John Smith"));
		assertThat(searchServer.getInfo(), sameInstance(info2));
		assertThat(searchServer.getIpport(), is("/some/path.html"));
		assertThat(searchServer.getPools(), empty());
		assertThat(searchServer.getTakeTraffic(), is(false));
	}

	@Test
	public void factory3() {
		SearchServer searchServer =
			 new SearchServer("John Smith", "foo", "foo", true, new Object());
		searchServer.setCluster("John Smith");
		Object info2 = new Object();
		searchServer.setInfo(info2);
		searchServer.setIpport("/some/path.html");
		searchServer.setPools(new HashSet<String>());
		searchServer.setTakeTraffic(false);
		assertThat(searchServer.getCluster(), is("John Smith"));
		assertThat(searchServer.getInfo(), sameInstance(info2));
		assertThat(searchServer.getIpport(), is("/some/path.html"));
		assertThat(searchServer.getPools(), empty());
		assertThat(searchServer.getTakeTraffic(), is(false));
	}
}
