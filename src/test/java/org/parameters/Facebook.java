package org.parameters;

import java.util.Date;

import org.sample.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook extends BaseClass{
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
		launchChrome();
	}
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
		quit();
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Test start...."+new Date());
	}
    @AfterMethod
    private void afterMethod() {
    	System.out.println("Test ends...."+new Date());
    }
    @Parameters({"userName","password"})
    @Test
    private void test1(String user, String pass) {
    	launchUrl("https://www.facebook.com/");
    	FbLoginPage l = new FbLoginPage();
    	fillTextBox(l.getUsername(), user);
    	fillTextBox(l.getPassword(), pass);
    	btnClick(l.getBtnclick());
    	System.out.println("Test1");
    	System.out.println("Start");
	}
    @Test(enabled=false)
    private void test2() {
    	System.out.println("Test2");
    }
    @Test
    private void test3() {
    	System.out.println("Test3");
	}
	
}
