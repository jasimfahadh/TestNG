package org.dataproviders;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.sample.BaseClass;
import org.sample.Locatorss;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelBookingThroughDataP extends BaseClass {
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
		System.out.println("Before Method");
		System.out.println("Test start...."+new Date());
	}
    @AfterMethod
    private void afterMethod() {
    	System.out.println("After Method");
    	System.out.println("Test ends...."+new Date());
    }
    @Test(dataProvider="login",dataProviderClass=A.class)
    private void test(String user, String pass) throws IOException {
		launchUrl("http://adactinhotelapp.com/index.php");
		maximize();
		implicitWait(10, TimeUnit.SECONDS);
		excelDataConfig("F:\\eclipse works\\eclipse-workspace\\MavenWrk\\src\\Excel\\Hotel.xlsx");
		Locatorss l = new Locatorss();
		l.getUsername().sendKeys(user);
		l.getPassword().sendKeys(pass);
		l.getLogin().click();
		new Select(l.getLocation()).selectByIndex(1);
		new Select(l.getHotels()).selectByIndex(1);
		new Select(l.getRoom_type()).selectByIndex(3);
		new Select(l.getRoom_nos()).selectByIndex(1);
		new Select(l.getAdult_room()).selectByIndex(1);
		new Select(l.getChild_room()).selectByIndex(1);
		l.getSubmit().click();l.getRadiobutton_0().click();l.getContinu().click();
		l.getFirst_name().sendKeys(getData(0, 1, 0));
		l.getLast_name().sendKeys(getData(0, 1, 1));
		l.getAddress().sendKeys(getData(0, 2, 0));
		l.getCc_num().sendKeys(datas(2, 1));
		new Select(l.getCc_type()).selectByIndex(2);
		new Select(l.getCc_exp_month()).selectByIndex(3);
		new Select(l.getCc_exp_year()).selectByIndex(5);
		l.getCc_cvv().sendKeys(datas(3, 0));
		l.getBook_now().click();
		scrollToBottom();
		System.out.println(l.getOrder_no().getAttribute("value"));
	}

}
