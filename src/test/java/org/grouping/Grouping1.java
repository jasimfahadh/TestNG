package org.grouping;

import org.testng.annotations.Test;

public class Grouping1 {
	@Test(groups= {"smoke","regression"})
	public void testA1() {
		System.out.println("testA1");
	}
	@Test(groups= {"sanity","regression"})
	public void testA2() {
		System.out.println("testA2");
	}
	@Test(groups="regression")
	public void testA3() {
		System.out.println("testA3");
	}
	@Test(groups="regression")
	public void testA4() {
		System.out.println("testA4");
	}
	@Test(groups= {"smoke","regression"})
	public void testA5() {
		System.out.println("testA5");
	}
	@Test(groups= {"sanity","regression"})
	public void testA6() {
		System.out.println("testA6");
	}
	

}
