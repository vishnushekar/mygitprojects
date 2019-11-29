package s.s;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sel {
	static WebDriver driver;
	@BeforeTest
		public void initiate() {
		System.setProperty("webdriver.chrome.driver","C:/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		}
	
  @Test
  public void runtest() throws InterruptedException {
	 
	  driver.get("http://13.72.253.0/dbp_webui/#/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("loginId")).sendKeys("vishnu.s@flamencotech.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("password")).sendKeys("@Abcd1234");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@id='submitDiv']")).click();
  }
}
