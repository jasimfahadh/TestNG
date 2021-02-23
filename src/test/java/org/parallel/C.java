package org.parallel;

import org.testng.annotations.Test;

public class C {
	@Test
	public void testC1() {
		System.out.println("testC1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testC2() {
		System.out.println("testC2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testC3() {
		System.out.println("testC3");
		System.out.println(Thread.currentThread().getId());
	}



}
