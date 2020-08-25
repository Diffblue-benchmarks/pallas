package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.ServiceInfo
 *
 * @author Diffblue Cover
 */

public class ServiceInfoTest {

	@Test
	public void factory1() {
		ServiceInfo serviceInfo = new ServiceInfo("bar", "Acme", "John Smith", "Mr");
		serviceInfo.setBackendAddress("280 Broadway");
		serviceInfo.setClusterName("John Smith");
		serviceInfo.setIndexName("Acme");
		assertThat(serviceInfo.getBackendAddress(), is("280 Broadway"));
		assertThat(serviceInfo.getClusterName(), is("John Smith"));
		assertThat(serviceInfo.getIndexName(), is("Acme"));
		assertThat(serviceInfo.getTargetGroupTitle(), is("Mr"));
	}

	@Test
	public void factory2() {
		ServiceInfo serviceInfo =
			 new ServiceInfo("280 Broadway", "Acme", "John Smith", null);
		serviceInfo.setBackendAddress("280 Broadway");
		serviceInfo.setClusterName("John Smith");
		serviceInfo.setIndexName("Acme");
		assertThat(serviceInfo.getBackendAddress(), is("280 Broadway"));
		assertThat(serviceInfo.getClusterName(), is("John Smith"));
		assertThat(serviceInfo.getIndexName(), is("Acme"));
		assertThat(serviceInfo.getTargetGroupTitle(), is(""));
	}
}
