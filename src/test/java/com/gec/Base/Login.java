package com.gec.Base;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Login extends TestBase{
	
	@Test(dataProviderClass=TestUtils.class,dataProvider="dp")
	public void Login(String un,String pw) throws InterruptedException {
		/*driver.findElement(By.name("misview")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/main/app-analysis/app-header/header/div/div/div[3]/div[2]/a/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("loginbtn")).click();
		System.out.println("username::"+un+"  pwd::"+pw);
		String loginbutton=driver.findElement(By.name("loginbtn")).getText();
		
		Assert.assertEquals(loginbutton, "LOGIN","Login page is not opened");
		
		//String approval=driver.findElement(By.name("approvals")).getText();
		
		//Assert.assertEquals("Approvals", approval,"login is not sucessfull");
		//as.assertAll();
		try {
		if(driver.findElement(By.name("approvals")).isDisplayed()) {
			System.out.println("login sucessfull");
			
			
		}
		}catch(Exception NoSuchElementException) {
			System.out.println("login not sucessfull");
		}
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout ")).click();
		System.out.println("logout");*/
		System.out.println("username::"+un);
		System.out.println("pwd::"+pw);
	}
		
		
	
	

}
