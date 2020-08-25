package com.vip.pallas.search.rampup;

import com.vip.pallas.search.exception.PallasTimeoutException;
import com.vip.pallas.search.model.IndexRampup;

import java.text.SimpleDateFormat;

import org.apache.http.HttpHost;
import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.rampup.RampupCallback
 *
 * @author Diffblue Cover
 */

public class RampupCallbackTest {

	@Test
	public void factory() throws java.text.ParseException {
		IndexRampup rampup = new IndexRampup();
		rampup.setBeginTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		rampup.setClusterName("John Smith");
		rampup.setEndTime(new SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31"));
		rampup.setFullIndexName("Acme");
		rampup.setIndexId(1L);
		rampup.setRampupNow(1L);
		rampup.setRampupTarget(1L);
		rampup.setState("New York");
		rampup.setVersionId(1L);
		// pojo RampupCallback
	}

	@Test
	public void failed() {
		new RampupCallback(new HttpHost("/some/path.html"), "/some/path.html", "1234", new IndexRampup()).failed(new PallasTimeoutException());
	}

	@Test
	public void cancelled() {
		new RampupCallback(new HttpHost("/some/path.html"), "/some/path.html", "1234", new IndexRampup()).cancelled();
	}
}
