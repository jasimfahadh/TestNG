package org.parameters;

import org.testng.annotations.*;

public class Parameterss {
	
	@Parameters({"userName","password"})
	@Test
	private void test1(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);

	}
	@Parameters({"userName","password"})
	@Test
	private void test2(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);

	}

}
