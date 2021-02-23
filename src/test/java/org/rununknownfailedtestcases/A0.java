package org.rununknownfailedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A0 {
	@Test
	public void testA1() {
		Assert.assertTrue(true);
		System.out.println("TestA1");
	}
	@Test
	public void testA2() {
		Assert.assertTrue(false);
		System.out.println("TestA2");
	}
	@Test
	public void testA3() {
		Assert.assertTrue(true);
		System.out.println("TestA3");
	}
	

}
