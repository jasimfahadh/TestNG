package org.dataproviders;

import org.testng.annotations.DataProvider;


public class A {
	
	@DataProvider(name="login")
	private Object[][] getData() {
		return new Object[][] {
			{"jasim","djfkl"},
			{"jasimfahadh12","fahadh123"}};
		
		
		}

}
