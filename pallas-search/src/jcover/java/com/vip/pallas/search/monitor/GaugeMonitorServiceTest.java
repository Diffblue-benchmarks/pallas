package com.vip.pallas.search.monitor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.fastjson.JSONObject;

import java.util.LinkedHashMap;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.monitor.GaugeMonitorService
 *
 * @author Diffblue Cover
 */

public class GaugeMonitorServiceTest {

	@Test
	public void incConns() {
		GaugeMonitorService.incConns();
	}

	@Test
	public void decConns() {
		GaugeMonitorService.decConns();
	}

	@Test
	public void incQPS() {
		GaugeMonitorService.incQPS();
	}

	@Test
	public void incReqesutThroughputDeltaIsOne() {
		GaugeMonitorService.incReqesutThroughput(1L);
	}

	@Test
	public void incResponseThroughputDeltaIsOne() {
		GaugeMonitorService.incResponseThroughput(1L);
	}

	@Test
	public void collectReturnsEmptyEmptyEmptyEmpty() {
		JSONObject result = GaugeMonitorService.collect();
		assertThat(((LinkedHashMap<?, ?>) result.get("conns")).isEmpty(), is(true));
		assertThat(((LinkedHashMap<?, ?>) result.get("qps")).isEmpty(), is(true));
		assertThat(((LinkedHashMap<?, ?>) result.get("reqThroughput")).isEmpty(), is(true));
		assertThat(((LinkedHashMap<?, ?>) result.get("respThroughput")).isEmpty(), is(true));
	}
}
