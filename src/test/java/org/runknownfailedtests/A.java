package org.runknownfailedtests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	public void testA1() {
		Assert.assertTrue(true);
		System.out.println("TestA1");
	}
	@Test(retryAnalyzer=KnownFailedTest.class)
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
