package com.sm_dataendpoint;

import org.testng.annotations.Test;

import com.sm_userrole.Newrole;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
 
	protected static  WebDriver wd;
	 
	@BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:/Chromedriver/chromedriver.exe");
		  wd = new ChromeDriver();
		  
	  }
	  
	 /* @AfterTest
	  public void aferTest() {
		 driver.quit();
	  }*/
	  
	  @Test
	public void login() throws InterruptedException{
		  wd.get("http://13.72.253.0/dbp_webui/#/");
		  wd.manage().window().maximize();
		  wd.findElement(By.id("loginId")).sendKeys("vishnu.s@flamencotech.com");
		  Thread.sleep(2000);
		  wd.findElement(By.id("password")).sendKeys("@Abcd1234");
		  
		  wd.findElement(By.xpath("//div[@id='submitDiv']")).click(); 
	  }
	  
	  
	  
public static void main() throws InterruptedException {
	

	 
	  Newrole u1 = new Newrole();
	  u1.edituser();
	  u1.createuser();
	  u1.deleteuser();
	  

	  }

}



  


