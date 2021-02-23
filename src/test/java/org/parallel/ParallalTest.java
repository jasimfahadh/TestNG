package org.parallel;

import org.testng.annotations.Test;

public class ParallalTest {
	@Test
	public void testA1() {
		System.out.println("testA1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testA2() {
		System.out.println("testA2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testA3() {
		System.out.println("testA3");
		System.out.println(Thread.currentThread().getId());
	}

}
