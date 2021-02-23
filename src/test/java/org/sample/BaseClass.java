package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	public static String value;
	public static Workbook wb;
	public static WebDriver launchChrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse works\\eclipse-workspace\\MavenWrk\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();	
		return driver;
		
	}
	public static WebDriver launchFirefox() {
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse works\\eclipse-workspace\\MavenWrk\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();	
		return driver;
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void sleepth(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void fillTextBox(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	public static WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public static WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	public static WebElement findElementByTagName(String tagname) {
		WebElement element = driver.findElement(By.tagName(tagname));
		return element;
	}
	public static WebElement findElementByClassName(String classname) {
		WebElement element = driver.findElement(By.className(classname));
		return element;
	}
	public static String getText(WebElement e) {
		String at = e.getText();
		return at;
	}
	public static String getAttribute(WebElement e) {
		String aa = e.getAttribute("value");
		return aa;
	}
	public static void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	public static void rightClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
	public static void dragAndDrop(WebElement source,WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target);
	}
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target);
	}
	
	public static void switchFrame(WebElement e) {
		driver.switchTo().frame(e);
	}
	public static void scrollDown(WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	public static void scrollUp(WebElement e) {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	public static void scrollToBottom() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
	}
	public static void scrollToTop() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,0)");
	}
	public static void closeWindow() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void pageSource() {
		String src = driver.getPageSource();
		System.out.println(src);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	public static void windowHandle() {
		String wh = driver.getWindowHandle();
		System.out.println(wh);
	}
	public static void windowHandles() {
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		for (String newWindow : windowhandles) {
			driver.switchTo().window(newWindow);
		}
	}
	public static void screenshot(String a) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(a);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void implicitWait(long a, TimeUnit b) {
		driver.manage().timeouts().implicitlyWait(a, b);
	}
	public static void excelDataConfig(String excelpath) throws IOException {
		File sr = new File(excelpath);
		FileInputStream in = new FileInputStream(sr);
		wb = new XSSFWorkbook(in);
	}
	public static String getData(int sheet,int row,int cell) {
		Sheet sheet1 = wb.getSheetAt(sheet);
		String data = sheet1.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public static String datas(int rowno, int cellno) throws IOException {
		File loc = new File("F:\\eclipse works\\eclipse-workspace\\MavenWrk\\src\\Excel\\Hotel.xlsx");
		FileInputStream st = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(st);
		Sheet sheet = w.getSheetAt(0);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int type = cell.getCellType();
		if (type == 1) {
			value = cell.getStringCellValue();
			
		}else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy");
				value = s.format(date);
			}else {
				double db = cell.getNumericCellValue();
				long ln =(long)db;
				value = String.valueOf(ln);
			}
		}
		return value;
        

	}
	

}
