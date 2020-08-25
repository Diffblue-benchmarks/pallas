package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.hamcrest.number.IsCloseTo.closeTo;

import java.util.Date;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.FlowRecord
 *
 * @author Diffblue Cover
 */

public class FlowRecordTest {

	@Test
	public void factory() throws java.text.ParseException {
		FlowRecord flowRecord = new FlowRecord();
		flowRecord.setConfigId(1L);
		Date createTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecord.setCreateTime(createTime);
		Date endTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecord.setEndTime(endTime);
		flowRecord.setFlowRecordConfig(null);
		flowRecord.setHasPrivilege(false);
		flowRecord.setId(1L);
		flowRecord.setIndexId(1L);
		flowRecord.setIsDeleted(false);
		flowRecord.setLimit(1L);
		flowRecord.setNote("foo");
		flowRecord.setSampleRate(1.0);
		Date startTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecord.setStartTime(startTime);
		flowRecord.setState(1);
		flowRecord.setTemplateId(1L);
		flowRecord.setTotal(1L);
		Date updateTime =
			 new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2010-12-31");
		flowRecord.setUpdateTime(updateTime);
		assertThat(flowRecord.getConfigId(), is(1L));
		assertThat(flowRecord.getCreateTime(), sameInstance(createTime));
		assertThat(flowRecord.getEndTime(), sameInstance(endTime));
		assertThat(flowRecord.getFlowRecordConfig(), is(nullValue()));
		assertThat(flowRecord.getId(), is(1L));
		assertThat(flowRecord.getIndexId(), is(1L));
		assertThat(flowRecord.getIsDeleted(), is(false));
		assertThat(flowRecord.getLimit(), is(1L));
		assertThat(flowRecord.getNote(), is("foo"));
		assertThat(flowRecord.getSampleRate(), closeTo(1.0, 0.0));
		assertThat(flowRecord.getStartTime(), sameInstance(startTime));
		assertThat(flowRecord.getState(), is(1));
		assertThat(flowRecord.getTemplateId(), is(1L));
		assertThat(flowRecord.getTotal(), is(1L));
		assertThat(flowRecord.getUpdateTime(), sameInstance(updateTime));
		assertThat(flowRecord.isHasPrivilege(), is(false));
	}

	@Test
	public void getPercentageReturnsOneHundred() {
		FlowRecord flowRecord = new FlowRecord();
		FlowRecordConfig flowRecordConfig = new FlowRecordConfig();
		flowRecordConfig.setLimit(1L);
		flowRecord.setFlowRecordConfig(flowRecordConfig);
		flowRecord.setTotal(1L);
		assertThat(flowRecord.getPercentage(), is(100));
	}
}
