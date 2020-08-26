package com.vip.pallas.search.filter.circuitbreaker;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

/**
 * Unit tests for com.vip.pallas.search.filter.circuitbreaker.ConcurrentHashMapV8
 *
 * @author Diffblue Cover
 */

public class ConcurrentHashMapV8Test {

	@Test
	public void factory() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("bar", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).get("bar"), is("foo"));
	}

	@Test
	public void isEmpty() {
		assertThat(new ConcurrentHashMapV8<String, String>(0, 1.0f).isEmpty(), is(true));
		assertThat(new ConcurrentHashMapV8<String, String>(1_073_741_824, 1.0f).isEmpty(), is(true));
		assertThat(new ConcurrentHashMapV8<String, String>().isEmpty(), is(true));
	}

	@Test
	public void spread() {
		assertThat(ConcurrentHashMapV8.spread(1), is(1));
		assertThat(ConcurrentHashMapV8.spread(0), is(0));
	}

	@Test
	public void comparableClassFor() {
		assertThat(ConcurrentHashMapV8.comparableClassFor(new Object()), is(nullValue()));
		assertThat(ConcurrentHashMapV8.comparableClassFor("foo"), equalTo((Class) String.class));
		assertThat(ConcurrentHashMapV8.comparableClassFor(1), equalTo((Class) Integer.class));
	}

	@Test
	public void compareComparables() {
		assertThat(ConcurrentHashMapV8.compareComparables(String.class, "foo", new Object()), is(0));
		assertThat(ConcurrentHashMapV8.compareComparables(String.class, "bar", "foo"), is(-4));
		assertThat(ConcurrentHashMapV8.compareComparables(String.class, "foo", "foo"), is(0));
		assertThat(ConcurrentHashMapV8.compareComparables(String.class, "foo", null), is(0));
	}

	@Test
	public void sizeReturnsOne() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).size(), is(1));
	}

	@Test
	public void sizeReturnsZero() {
		assertThat(new ConcurrentHashMapV8<String, String>().size(), is(0));
	}

	@Test
	public void isEmptyReturnsFalse() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).isEmpty(), is(false));
	}

	@Test
	public void containsKey() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).containsKey(new Object()), is(false));
	}

	@Test
	public void containsKeyKeyIsFoo() {
		assertThat(new ConcurrentHashMapV8<String, String>().containsKey("foo"), is(false));
	}

	@Test
	public void containsValueValueIsFooReturnsFalse() {
		assertThat(new ConcurrentHashMapV8<String, String>().containsValue("foo"), is(false));
	}

	@Test
	public void putKeyIsBarReturnsNull() {
		ConcurrentHashMapV8<String, String> concurrentHashMapV8 =
			 new ConcurrentHashMapV8<String, String>();
		assertThat(concurrentHashMapV8.put("bar", "foo"), is(nullValue()));
		assertThat(concurrentHashMapV8.get("bar"), is("foo"));
	}

	@Test
	public void putKeyIsFooReturnsFoo() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).put("foo", "foo"), is("foo"));
	}

	@Test
	public void putAllMIsFoo() {

		// arrange
		ConcurrentHashMapV8<String, String> concurrentHashMapV8 =
			 new ConcurrentHashMapV8<String, String>();
		HashMap<String, String> m2 = new HashMap<String, String>();
		m2.put("bar", "foo");

		// act
		concurrentHashMapV8.putAll(m2);

		// assert
		assertThat(concurrentHashMapV8.get("bar"), is("foo"));
	}

	@Test
	public void clear1() {
		new ConcurrentHashMapV8<String, String>().clear();
	}

	@Test
	public void clear2() {

		// arrange
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		ConcurrentHashMapV8<String, String> concurrentHashMapV8 =
			 new ConcurrentHashMapV8<String, String>(m);

		// act
		concurrentHashMapV8.clear();

		// assert
		assertThat(concurrentHashMapV8.isEmpty(), is(true));
	}

	@Test
	public void keySet() {
		assertThat(new ConcurrentHashMapV8<String, String>().keySet(), empty());
		assertThat(new ConcurrentHashMapV8<String, String>().keySet(), empty());
		assertThat(new ConcurrentHashMapV8<String, String>().keySet("foo"), empty());
	}

	@Test
	public void valuesReturnsEmpty() {
		assertThat(new ConcurrentHashMapV8<String, String>().values(), empty());
	}

	@Test
	public void entrySetReturnsEmpty() {
		assertThat(new ConcurrentHashMapV8<String, String>().entrySet(), empty());
	}

	@Test
	public void equalsOIsFoo() {
		assertThat(new ConcurrentHashMapV8<String, String>().equals("foo"), is(false));
	}

	@Test
	public void testEquals() {
		Map map = new HashMap();
		map.put(new Object(), new Object());
		assertThat(new ConcurrentHashMapV8<String, String>().equals(map), is(false));
	}

	@Test
	public void putIfAbsentKeyIsFooAndValueIsFooReturnsFoo() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).putIfAbsent("foo", "foo"), is("foo"));
	}

	@Test
	public void remove1() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).remove(new Object(), new Object()), is(false));
	}

	@Test
	public void remove2() {
		assertThat(new ConcurrentHashMapV8<String, String>().remove("foo", new Object()), is(false));
		assertThat(new ConcurrentHashMapV8<String, String>().remove("foo"), is(nullValue()));
		assertThat(new ConcurrentHashMapV8<String, String>().remove(new Object(), null), is(false));
	}

	@Test
	public void replaceKeyIsBarReturnsFalse() {
		assertThat(new ConcurrentHashMapV8<String, String>().replace("bar", "foo", "foo"), is(false));
	}

	@Test
	public void replaceReturnsTrue() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).replace("foo", "foo", "foo"), is(true));
	}

	@Test
	public void replaceValueIsFooReturnsFoo() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).replace("foo", "foo"), is("foo"));
	}

	@Test
	public void getOrDefaultDefaultValueIsFooReturnsFoo() {
		assertThat(new ConcurrentHashMapV8<String, String>().getOrDefault(new Object(), "foo"), is("foo"));
	}

	@Test
	public void forEach1() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiAction<Object, Object> action =
			 mock(ConcurrentHashMapV8.BiAction.class);
		new ConcurrentHashMapV8<String, String>().forEach(action);
	}

	@Test
	public void forEach2() {

		// arrange
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiAction<Object, Object> action =
			 mock(ConcurrentHashMapV8.BiAction.class);

		// act
		new ConcurrentHashMapV8<String, String>(m).forEach(action);

		// assert
		Mockito.verify(action).apply(ArgumentMatchers.<Object>any(), ArgumentMatchers.<Object>any());
	}

	@Test
	public void replaceAll() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> function =
			 mock(ConcurrentHashMapV8.BiFun.class);
		new ConcurrentHashMapV8<String, String>().replaceAll(function);
	}

	@Test
	public void computeIfAbsent1() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> mappingFunction =
			 mock(ConcurrentHashMapV8.Fun.class);
		assertThat(new ConcurrentHashMapV8<String, String>(m).computeIfAbsent("foo", mappingFunction), is("foo"));
	}

	@Test
	public void computeIfAbsent2() {
		ConcurrentHashMapV8<String, String> concurrentHashMapV8 =
			 new ConcurrentHashMapV8<String, String>();
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> mappingFunction =
			 mock(ConcurrentHashMapV8.Fun.class);
		when(mappingFunction.apply(Mockito.<Object>any()))
			.thenReturn("foo");
		assertThat(concurrentHashMapV8.computeIfAbsent("foo", mappingFunction), is("foo"));
		assertThat(concurrentHashMapV8.get("foo"), is("foo"));
	}

	@Test
	public void computeIfPresentKeyIsFooReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> remappingFunction =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().computeIfPresent("foo", remappingFunction), is(nullValue()));
	}

	@Test
	public void computeKeyIsFooReturnsFoo() {
		ConcurrentHashMapV8<String, String> concurrentHashMapV8 =
			 new ConcurrentHashMapV8<String, String>();
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> remappingFunction =
			 mock(ConcurrentHashMapV8.BiFun.class);
		when(remappingFunction.apply(Mockito.<Object>any(), Mockito.<Object>any()))
			.thenReturn("foo");
		assertThat(concurrentHashMapV8.compute("foo", remappingFunction), is("foo"));
		assertThat(concurrentHashMapV8.get("foo"), is("foo"));
	}

	@Test
	public void mergeKeyIsBar() {
		ConcurrentHashMapV8<String, String> concurrentHashMapV8 =
			 new ConcurrentHashMapV8<String, String>();
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> remappingFunction =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(concurrentHashMapV8.merge("bar", "foo", remappingFunction), is("foo"));
		assertThat(concurrentHashMapV8.get("bar"), is("foo"));
	}

	@Test
	public void mergeKeyIsFoo() {
		ConcurrentHashMapV8<String, String> concurrentHashMapV8 =
			 new ConcurrentHashMapV8<String, String>(1);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> remappingFunction =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(concurrentHashMapV8.merge("foo", "foo", remappingFunction), is("foo"));
		assertThat(concurrentHashMapV8.get("foo"), is("foo"));
	}

	@Test
	public void contains() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).contains(new Object()), is(false));
	}

	@Test
	public void containsValueIsFoo() {
		assertThat(new ConcurrentHashMapV8<String, String>().contains("foo"), is(false));
	}

	@Test
	public void keys1() {
		assertThat(new ConcurrentHashMapV8<String, String>().keys().hasMoreElements(), is(false));
	}

	@Test
	public void keys2() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).keys().hasMoreElements(), is(true));
	}

	@Test
	public void elements1() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).elements().hasMoreElements(), is(true));
	}

	@Test
	public void elements2() {
		assertThat(new ConcurrentHashMapV8<String, String>().elements().hasMoreElements(), is(false));
		assertThat(new ConcurrentHashMapV8<String, String>(1).elements().hasMoreElements(), is(false));
		assertThat(new ConcurrentHashMapV8<String, String>(1, 1.0f).elements().hasMoreElements(), is(false));
	}

	@Test
	public void mappingCountReturnsOne() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).mappingCount(), is(1L));
	}

	@Test
	public void mappingCountReturnsZero() {
		assertThat(new ConcurrentHashMapV8<String, String>().mappingCount(), is(0L));
	}

	@Test
	public void newKeySet() {
		assertThat(ConcurrentHashMapV8.<String>newKeySet(), empty());
		assertThat(ConcurrentHashMapV8.<String>newKeySet(536_870_912), empty());
		assertThat(ConcurrentHashMapV8.<String>newKeySet(1), empty());
	}

	@Test
	public void resizeStampNIsOne() {
		assertThat(ConcurrentHashMapV8.resizeStamp(1), is(32_799));
	}

	@Test
	public void batchForBIsOneReturnsZero() {
		assertThat(new ConcurrentHashMapV8<String, String>().batchFor(1L), is(0));
	}

	@Test
	public void forEachParallelismThresholdIsOne1() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiAction<Object, Object> action =
			 mock(ConcurrentHashMapV8.BiAction.class);
		new ConcurrentHashMapV8<String, String>().forEach(1L, action);
	}

	@Test
	public void forEachParallelismThresholdIsOne2() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> transformer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Action<Object> action =
			 mock(ConcurrentHashMapV8.Action.class);
		new ConcurrentHashMapV8<String, String>().<String>forEach(1L, transformer, action);
	}

	@Test
	public void searchParallelismThresholdIsOneReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> searchFunction =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>search(1L, searchFunction), is(nullValue()));
	}

	@Test
	public void reduceParallelismThresholdIsOneReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> transformer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> reducer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>reduce(1L, transformer, reducer), is(nullValue()));
	}

	@Test
	public void reduceToDoubleBasisIsOneAndParallelismThresholdIsOneReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectByObjectToDouble<Object, Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectByObjectToDouble.class);
		ConcurrentHashMapV8.DoubleByDoubleToDouble reducer =
			 mock(ConcurrentHashMapV8.DoubleByDoubleToDouble.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceToDouble(1L, transformer, 1.0, reducer), closeTo(1.0, 0.0));
	}

	@Test
	public void reduceToLongBasisIsOneAndParallelismThresholdIsZeroReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectByObjectToLong<Object, Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectByObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceToLong(0L, transformer, 1L, reducer), is(1L));
	}

	@Test
	public void reduceToLongBasisIsZeroAndParallelismThresholdIsOneReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectByObjectToLong<Object, Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectByObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceToLong(1L, transformer, 0L, reducer), is(0L));
	}

	@Test
	public void reduceToIntBasisIsOneReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectByObjectToInt<Object, Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectByObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceToInt(1L, transformer, 1, reducer), is(1));
	}

	@Test
	public void reduceToIntBasisIsZeroReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectByObjectToInt<Object, Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectByObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceToInt(1L, transformer, 0, reducer), is(0));
	}

	@Test
	public void forEachKey1() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Action<Object> action =
			 mock(ConcurrentHashMapV8.Action.class);
		new ConcurrentHashMapV8<String, String>().forEachKey(1L, action);
	}

	@Test
	public void forEachKey2() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> transformer =
			 mock(ConcurrentHashMapV8.Fun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Action<Object> action =
			 mock(ConcurrentHashMapV8.Action.class);
		new ConcurrentHashMapV8<String, String>().<String>forEachKey(1L, transformer, action);
	}

	@Test
	public void searchKeysParallelismThresholdIsOneReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> searchFunction =
			 mock(ConcurrentHashMapV8.Fun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>searchKeys(1L, searchFunction), is(nullValue()));
	}

	@Test
	public void reduceKeysReturnsFoo() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> reducer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>(m).reduceKeys(1L, reducer), is("foo"));
	}

	@Test
	public void reduceKeysReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> transformer =
			 mock(ConcurrentHashMapV8.Fun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> reducer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>reduceKeys(1L, transformer, reducer), is(nullValue()));
	}

	@Test
	public void reduceKeysToDoubleBasisIsOneAndParallelismThresholdIsOneReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToDouble<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToDouble.class);
		ConcurrentHashMapV8.DoubleByDoubleToDouble reducer =
			 mock(ConcurrentHashMapV8.DoubleByDoubleToDouble.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceKeysToDouble(1L, transformer, 1.0, reducer), closeTo(1.0, 0.0));
	}

	@Test
	public void reduceKeysToLongBasisIsOneAndParallelismThresholdIsZeroReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToLong<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceKeysToLong(0L, transformer, 1L, reducer), is(1L));
	}

	@Test
	public void reduceKeysToLongBasisIsZeroAndParallelismThresholdIsOneReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToLong<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceKeysToLong(1L, transformer, 0L, reducer), is(0L));
	}

	@Test
	public void reduceKeysToIntBasisIsOneReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToInt<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceKeysToInt(1L, transformer, 1, reducer), is(1));
	}

	@Test
	public void reduceKeysToIntBasisIsZeroReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToInt<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceKeysToInt(1L, transformer, 0, reducer), is(0));
	}

	@Test
	public void forEachValue1() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Action<Object> action =
			 mock(ConcurrentHashMapV8.Action.class);
		new ConcurrentHashMapV8<String, String>().forEachValue(1L, action);
	}

	@Test
	public void forEachValue2() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> transformer =
			 mock(ConcurrentHashMapV8.Fun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Action<Object> action =
			 mock(ConcurrentHashMapV8.Action.class);
		new ConcurrentHashMapV8<String, String>().<String>forEachValue(1L, transformer, action);
	}

	@Test
	public void searchValuesParallelismThresholdIsOneReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> searchFunction =
			 mock(ConcurrentHashMapV8.Fun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>searchValues(1L, searchFunction), is(nullValue()));
	}

	@Test
	public void reduceValuesReturnsFoo() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> reducer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>(m).reduceValues(1L, reducer), is("foo"));
	}

	@Test
	public void reduceValuesReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Object, String> transformer =
			 mock(ConcurrentHashMapV8.Fun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> reducer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>reduceValues(1L, transformer, reducer), is(nullValue()));
	}

	@Test
	public void reduceValuesToDoubleBasisIsOneAndParallelismThresholdIsOneReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToDouble<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToDouble.class);
		ConcurrentHashMapV8.DoubleByDoubleToDouble reducer =
			 mock(ConcurrentHashMapV8.DoubleByDoubleToDouble.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceValuesToDouble(1L, transformer, 1.0, reducer), closeTo(1.0, 0.0));
	}

	@Test
	public void reduceValuesToLongBasisIsOneAndParallelismThresholdIsZeroReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToLong<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceValuesToLong(0L, transformer, 1L, reducer), is(1L));
	}

	@Test
	public void reduceValuesToLongBasisIsZeroAndParallelismThresholdIsOneReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToLong<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceValuesToLong(1L, transformer, 0L, reducer), is(0L));
	}

	@Test
	public void reduceValuesToIntBasisIsOneReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToInt<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceValuesToInt(1L, transformer, 1, reducer), is(1));
	}

	@Test
	public void reduceValuesToIntBasisIsZeroReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToInt<Object> transformer =
			 mock(ConcurrentHashMapV8.ObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceValuesToInt(1L, transformer, 0, reducer), is(0));
	}

	@Test
	public void forEachEntry1() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Action<Object> action =
			 mock(ConcurrentHashMapV8.Action.class);
		new ConcurrentHashMapV8<String, String>().forEachEntry(1L, action);
	}

	@Test
	public void forEachEntry2() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Map.Entry<String, String>, String> transformer =
			 mock(ConcurrentHashMapV8.Fun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Action<Object> action =
			 mock(ConcurrentHashMapV8.Action.class);
		new ConcurrentHashMapV8<String, String>().<String>forEachEntry(1L, transformer, action);
	}

	@Test
	public void searchEntriesParallelismThresholdIsOneReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Map.Entry<String, String>, String> searchFunction =
			 mock(ConcurrentHashMapV8.Fun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>searchEntries(1L, searchFunction), is(nullValue()));
	}

	@Test
	public void reduceEntries() {

		// arrange
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Map.Entry<String, String>, Map.Entry<String, String>, Map.Entry<String, String>> reducer =
			 mock(ConcurrentHashMapV8.BiFun.class);

		// act
		Map.Entry<String, String> result =
			 new ConcurrentHashMapV8<String, String>(m).reduceEntries(1L, reducer);

		// assert
		assertThat(result.getKey(), is("foo"));
		assertThat(result.getValue(), is("foo"));
	}

	@Test
	public void reduceEntriesReturnsNull() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.Fun<Map.Entry<String, String>, String> transformer =
			 mock(ConcurrentHashMapV8.Fun.class);
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.BiFun<Object, Object, String> reducer =
			 mock(ConcurrentHashMapV8.BiFun.class);
		assertThat(new ConcurrentHashMapV8<String, String>().<String>reduceEntries(1L, transformer, reducer), is(nullValue()));
	}

	@Test
	public void reduceEntriesToDouble() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToDouble<Map.Entry<String, String>> transformer =
			 mock(ConcurrentHashMapV8.ObjectToDouble.class);
		ConcurrentHashMapV8.DoubleByDoubleToDouble reducer =
			 mock(ConcurrentHashMapV8.DoubleByDoubleToDouble.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceEntriesToDouble(9_223_372_036_854_775_807L, transformer, 1.0, reducer), closeTo(1.0, 0.0));
	}

	@Test
	public void reduceEntriesToDoubleParallelismThresholdIsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToDouble<Map.Entry<String, String>> transformer =
			 mock(ConcurrentHashMapV8.ObjectToDouble.class);
		ConcurrentHashMapV8.DoubleByDoubleToDouble reducer =
			 mock(ConcurrentHashMapV8.DoubleByDoubleToDouble.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceEntriesToDouble(1L, transformer, 1.0, reducer), closeTo(1.0, 0.0));
	}

	@Test
	public void reduceEntriesToLongBasisIsOneAndParallelismThresholdIsZeroReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToLong<Map.Entry<String, String>> transformer =
			 mock(ConcurrentHashMapV8.ObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceEntriesToLong(0L, transformer, 1L, reducer), is(1L));
	}

	@Test
	public void reduceEntriesToLongBasisIsZeroAndParallelismThresholdIsOneReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToLong<Map.Entry<String, String>> transformer =
			 mock(ConcurrentHashMapV8.ObjectToLong.class);
		ConcurrentHashMapV8.LongByLongToLong reducer =
			 mock(ConcurrentHashMapV8.LongByLongToLong.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceEntriesToLong(1L, transformer, 0L, reducer), is(0L));
	}

	@Test
	public void reduceEntriesToIntBasisIsOneReturnsOne() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToInt<Map.Entry<String, String>> transformer =
			 mock(ConcurrentHashMapV8.ObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceEntriesToInt(1L, transformer, 1, reducer), is(1));
	}

	@Test
	public void reduceEntriesToIntBasisIsZeroReturnsZero() {
		@SuppressWarnings("unchecked")
		ConcurrentHashMapV8.ObjectToInt<Map.Entry<String, String>> transformer =
			 mock(ConcurrentHashMapV8.ObjectToInt.class);
		ConcurrentHashMapV8.IntByIntToInt reducer =
			 mock(ConcurrentHashMapV8.IntByIntToInt.class);
		assertThat(new ConcurrentHashMapV8<String, String>().reduceEntriesToInt(1L, transformer, 0, reducer), is(0));
	}

	@Test
	public void sumCountReturnsOne() {
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("foo", "foo");
		assertThat(new ConcurrentHashMapV8<String, String>(m).sumCount(), is(1L));
	}

	@Test
	public void sumCountReturnsZero() {
		assertThat(new ConcurrentHashMapV8<String, String>().sumCount(), is(0L));
	}
}
