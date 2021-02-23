package org.crossbrowser;

import java.util.Date;

import org.sample.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest extends BaseClass {
	@Parameters({"browserName"})
	@BeforeClass
	private void beforeClass(String browser) {
		System.out.println("Before Class");
		if (browser.equals("chrome")) {
			launchChrome();
			
		} else if (browser.equals("firefox")) {
			launchFirefox();
			
		} else {
			System.err.println("Browser is invalid");
		}
	}
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
		quit();
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
		System.out.println("Test start...."+new Date());
	}
    @AfterMethod
    private void afterMethod() {
    	System.out.println("After Method");
    	System.out.println("Test ends...."+new Date());
    }
    @Test
    public void test() {
    	launchUrl("https://www.facebook.com");
    	FbLoginLocator fb= new FbLoginLocator();
    	fillTextBox(fb.getUserName(), "jasimfahadh");
    	fillTextBox(fb.getPassword(), "passssss");
//    	btnClick(fb.getBtnLogin());
    	System.out.println("Test1");
    }

}
