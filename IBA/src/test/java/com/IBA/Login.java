package com.IBA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DBPLoginpage;
import utility.ConfigReader;

public class Login {
	 WebDriver driver;
  @Test
  public void setpage() throws InterruptedException {
	  ConfigReader config = new ConfigReader();
	  System.setProperty("webdriver.chrome.driver",config.getChromepath());
	  driver = new ChromeDriver();
	  driver.get(config.getWebURL());
	  DBPLoginpage lp = new DBPLoginpage(driver);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  lp.username().clear();
	  lp.username().sendKeys(config.getusername2());
	  lp.password().clear();
	  lp.password().sendKeys(config.getpassword2());
	  lp.Submit().click(); 
	  
	  
  }
}
