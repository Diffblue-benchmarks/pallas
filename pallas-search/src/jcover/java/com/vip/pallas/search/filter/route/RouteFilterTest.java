package com.vip.pallas.search.filter.route;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.vip.pallas.search.model.IndexRouting;
import com.vip.pallas.search.netty.http.NettyPallasRequest;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.FullHttpRequest;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.filter.route.RouteFilter
 *
 * @author Diffblue Cover
 */

public class RouteFilterTest {

	@Test
	public void factory() {
		RouteFilter routeFilter = new RouteFilter();
		routeFilter.setValid(false);
		assertThat(routeFilter.isValid(), is(false));
	}

	@Test
	public void name() {
		assertThat(new RouteFilter().name(), is("PALLAS_FILTER_ROUTEFILTER"));
	}

	@Test
	public void checkOperation() {
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
		// pojo RouteFilter.OperationType
	}

	@Test
	public void randomTargetGroupByWeight() {
		ArrayList<IndexRouting.ConditionTarget> randomList =
			 new ArrayList<IndexRouting.ConditionTarget>();
		IndexRouting.ConditionTarget conditionTarget =
			 new IndexRouting.ConditionTarget();
		randomList.add(conditionTarget);
		assertThat(new RouteFilter().randomTargetGroupByWeight(randomList), sameInstance(conditionTarget));
	}

	@Test
	public void extractTargetGroupFromScrollIdReturnsEmpty() throws java.util.concurrent.ExecutionException {
		FullHttpRequest httpRequest = mock(FullHttpRequest.class);
		when(httpRequest.content())
			.thenReturn(Unpooled.directBuffer());
		Channel channel = mock(Channel.class);
		assertThat(new RouteFilter().extractTargetGroupFromScrollId(new NettyPallasRequest(httpRequest, channel)), empty());
	}
}
