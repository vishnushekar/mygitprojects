package com.sm_crud;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
 
	protected static  WebDriver driver;
	 
	@BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:/Chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
		  
	  }
	  
	 /* @AfterTest
	  public void aferTest() {
		 driver.quit();
	  }*/
	  
	  @Test
	public void login() throws InterruptedException{
		  driver.get("http://13.72.253.0/dbp_webui/#/");
		  driver.manage().window().maximize();
		  driver.findElement(By.cssSelector("#loginId")).sendKeys("vishnu.s@flamencotech.com");
		  Thread.sleep(2000);
		  driver.findElement(By.id("password")).sendKeys("@Abcd1234");
		  
		  driver.findElement(By.xpath("//div[@id='submitDiv']")).click(); 
	  }
	  
	  
	  
public static void main() throws InterruptedException {
	

	  db u = new db();
	  u.createuser();
	  u.viewuser();
	  u.delete();
	

	  }

}



  


