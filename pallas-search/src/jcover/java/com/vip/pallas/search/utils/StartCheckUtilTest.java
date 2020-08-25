package com.vip.pallas.search.utils;

import org.junit.Test;

/**
 * Unit tests for com.vip.pallas.search.utils.StartCheckUtil
 *
 * @author Diffblue Cover
 */

public class StartCheckUtilTest {

	@Test
	public void add2CheckListItemsIsPort() {
		StartCheckUtil.add2CheckList(StartCheckUtil.StartCheckItem.PORT);
	}

	@Test
	public void setErrorItemIsPort() {
		StartCheckUtil.setError(StartCheckUtil.StartCheckItem.PORT);
	}

	@Test
	public void setOkItemIsPort() {
		StartCheckUtil.setOk(StartCheckUtil.StartCheckItem.PORT);
	}
}
