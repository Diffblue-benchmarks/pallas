package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.IndexRampup
 *
 * @author Diffblue Cover
 */

public class IndexRampupTest {

	@Test
	public void factory() throws java.text.ParseException {
		IndexRampup indexRampup = new IndexRampup();
		Date beginTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		indexRampup.setBeginTime(beginTime);
		indexRampup.setClusterName("John Smith");
		Date endTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		indexRampup.setEndTime(endTime);
		indexRampup.setFullIndexName("Acme");
		indexRampup.setIndexId(1L);
		indexRampup.setRampupNow(1L);
		indexRampup.setRampupTarget(1L);
		indexRampup.setState("New York");
		indexRampup.setVersionId(1L);
		assertThat(indexRampup.getBeginTime(), sameInstance(beginTime));
		assertThat(indexRampup.getClusterName(), is("John Smith"));
		assertThat(indexRampup.getEndTime(), sameInstance(endTime));
		assertThat(indexRampup.getFullIndexName(), is("Acme"));
		assertThat(indexRampup.getIndexId(), is(1L));
		assertThat(indexRampup.getState(), is("New York"));
		assertThat(indexRampup.getVersionId(), is(1L));
	}

	@Test
	public void needRampupReturnsFalse() {
		assertThat(new IndexRampup().needRampup(), is(false));
	}

	@Test
	public void needRampupReturnsTrue() {
		IndexRampup indexRampup = new IndexRampup();
		indexRampup.setState("doing");
		assertThat(indexRampup.needRampup(), is(true));
	}

	@Test
	public void getRampupTargetReturnsOne() {
		IndexRampup indexRampup = new IndexRampup();
		indexRampup.setRampupTarget(1L);
		assertThat(indexRampup.getRampupTarget(), is(1L));
	}

	@Test
	public void getRampupTargetReturnsZero() {
		IndexRampup indexRampup = new IndexRampup();
		indexRampup.setRampupTarget(0L);
		assertThat(indexRampup.getRampupTarget(), is(0L));
	}

	@Test
	public void getRampupNowReturnsOne() {
		IndexRampup indexRampup = new IndexRampup();
		indexRampup.setRampupNow(1L);
		assertThat(indexRampup.getRampupNow(), is(1L));
	}

	@Test
	public void getRampupNowReturnsZero() {
		IndexRampup indexRampup = new IndexRampup();
		indexRampup.setRampupNow(0L);
		assertThat(indexRampup.getRampupNow(), is(0L));
	}
}
