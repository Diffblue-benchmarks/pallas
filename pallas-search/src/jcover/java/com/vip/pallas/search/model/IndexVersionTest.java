package com.vip.pallas.search.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.model.IndexVersion
 *
 * @author Diffblue Cover
 */

public class IndexVersionTest {

	@Test
	public void factory() {
		IndexVersion indexVersion = new IndexVersion();
		indexVersion.setAllocationNodes("DE");
		indexVersion.setCheckSum(false);
		indexVersion.setDynamic(false);
		indexVersion.setFetchSlowThreshold(1L);
		indexVersion.setFilterFields(false);
		indexVersion.setId(1L);
		indexVersion.setIdField("1234");
		indexVersion.setIndexId(1L);
		indexVersion.setIndexSlowThreshold(1L);
		indexVersion.setPreferExecutor("1.0");
		indexVersion.setQuerySlowThreshold(1L);
		indexVersion.setRampUp("1.0");
		indexVersion.setRealClusterIds("John Smith");
		indexVersion.setRefreshInterval((byte) 1);
		indexVersion.setReplicationNum(1);
		indexVersion.setRoutingKey("key");
		indexVersion.setSchema(new ArrayList<IndexVersion.VersionField>());
		indexVersion.setShardNum(1);
		indexVersion.setSync(false);
		indexVersion.setUpdateTimeField("data");
		indexVersion.setVdp(1);
		indexVersion.setVdpQueue("1.0");
		assertThat(indexVersion.getAllocationNodes(), is("DE"));
		assertThat(indexVersion.getCheckSum(), is(false));
		assertThat(indexVersion.getDynamic(), is(false));
		assertThat(indexVersion.getFetchSlowThreshold(), is(1L));
		assertThat(indexVersion.getFilterFields(), is(false));
		assertThat(indexVersion.getId(), is(1L));
		assertThat(indexVersion.getIdField(), is("1234"));
		assertThat(indexVersion.getIndexId(), is(1L));
		assertThat(indexVersion.getIndexSlowThreshold(), is(1L));
		assertThat(indexVersion.getPreferExecutor(), is("1.0"));
		assertThat(indexVersion.getQuerySlowThreshold(), is(1L));
		assertThat(indexVersion.getRampUp(), is("1.0"));
		assertThat(indexVersion.getRealClusterIds(), is("John Smith"));
		assertThat(indexVersion.getRefreshInterval(), is((byte) 1));
		assertThat(indexVersion.getReplicationNum(), is(1));
		assertThat(indexVersion.getRoutingKey(), is("key"));
		assertThat(indexVersion.getSchema(), empty());
		assertThat(indexVersion.getShardNum(), is(1));
		assertThat(indexVersion.getSync(), is(false));
		assertThat(indexVersion.getUpdateTimeField(), is("data"));
		assertThat(indexVersion.getVdp(), is(1));
		assertThat(indexVersion.getVdpQueue(), is("1.0"));
	}

	@Test
	public void addField() {

		// arrange
		IndexVersion indexVersion = new IndexVersion();
		ArrayList<IndexVersion.VersionField> schema =
			 new ArrayList<IndexVersion.VersionField>();
		schema.add(new IndexVersion.VersionField());
		indexVersion.setSchema(schema);
		IndexVersion.VersionField field = new IndexVersion.VersionField();

		// act
		indexVersion.addField(field);

		// assert
		assertThat(indexVersion.getSchema().size(), is(2));
		assertThat(indexVersion.getSchema().get(1), sameInstance(field));
	}
}
