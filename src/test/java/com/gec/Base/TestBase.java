package com.gec.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class TestBase {
	public WebDriver driver;
	
	public static   ExcelReader excel;
	@BeforeTest
	public void setUp() {
		excel=new  ExcelReader("/home/vassar/Desktop/Login.xlsx");
		System.setProperty("webdriver.chrome.driver","/home/vassar/Documents/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://apgrace.vassarlabs.com/dev");
		
		
	}
	@AfterTest
public void tearDown() {
	driver.quit();
	
}
}
