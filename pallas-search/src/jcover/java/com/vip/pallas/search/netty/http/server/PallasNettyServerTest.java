package com.vip.pallas.search.netty.http.server;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.netty.http.server.PallasNettyServer
 *
 * @author Diffblue Cover
 */

public class PallasNettyServerTest {

	@Test
	public void factory() {
		assertThat(new PallasNettyServer().getChannelFuture(), is(nullValue()));
	}

	@Test
	public void shutdownBossGroup() {
		new PallasNettyServer().shutdownBossGroup();
	}

	@Test
	public void isBossGroupShuttingDownReturnsFalse() {
		assertThat(new PallasNettyServer().isBossGroupShuttingDown(), is(false));
	}

	@Test
	public void shutdownWorkerGroup() {
		new PallasNettyServer().shutdownWorkerGroup();
	}

	@Test
	public void isWorkerGroupShuttingDownReturnsFalse() {
		assertThat(new PallasNettyServer().isWorkerGroupShuttingDown(), is(false));
	}
}
