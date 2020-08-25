package com.vip.pallas.search.monitor;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.monitor.UploadInfoService
 *
 * @author Diffblue Cover
 */

public class UploadInfoServiceTest {

	@Test
	public void startUploadTimmer() throws java.net.UnknownHostException {
		new UploadInfoService().startUploadTimmer();
	}

	@Test
	public void internalUploadInfoIsFoo() {
		UploadInfoService.internalUpload("foo", false);
	}

	@Test
	public void internalUploadInfoIsNull() {
		UploadInfoService.internalUpload(null, false);
	}
}
