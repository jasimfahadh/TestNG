package org.parallel;

import org.testng.annotations.Test;

public class B {
	@Test
	public void testB1() {
		System.out.println("testB1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testB2() {
		System.out.println("testB2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testB3() {
		System.out.println("testB3");
		System.out.println(Thread.currentThread().getId());
	}



}
