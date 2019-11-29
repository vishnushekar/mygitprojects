package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	static WebDriver driver;
	
	@BeforeTest
	public void setpath() {
		System.setProperty("webdriver.chrome.driver","C:/Chromedriver/chromedriver.exe");
		  driver = new ChromeDriver();
	}
	
	
	@Test
  public void Initialize() {
		driver.get("http://13.72.253.0/dbp_webui/#/");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginId")).sendKeys("vishnu.s@flamencotech.com");
		driver.findElement(By.id("password")).sendKeys("@Abcd1234");
		driver.findElement(By.id("submitDiv")).click();
	  
	  
  }
}
