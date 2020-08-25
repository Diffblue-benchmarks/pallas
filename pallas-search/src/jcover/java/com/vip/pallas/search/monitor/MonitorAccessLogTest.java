package com.vip.pallas.search.monitor;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.monitor.MonitorAccessLog
 *
 * @author Diffblue Cover
 */

public class MonitorAccessLogTest {

	@Test
	public void factory() {
		MonitorAccessLog monitorAccessLog = new MonitorAccessLog();
		monitorAccessLog.setRequestBody("/some/path.html");
		// pojo MonitorAccessLog
	}

	@Test
	public void shutdown() {
		MonitorAccessLog.shutdown();
	}

	@Test
	public void startUpstreamTime() {
		new MonitorAccessLog().startUpstreamTime();
	}

	@Test
	public void endUpstreamTime() {
		new MonitorAccessLog().endUpstreamTime();
	}
}
