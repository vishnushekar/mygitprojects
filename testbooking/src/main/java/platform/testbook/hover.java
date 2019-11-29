package platform.testbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
//	    driver.get("http://qaclickacademy.com/practice.php");
//	    Actions a = new Actions(driver);
//	  // a.moveToElement(driver.findElement(By.cssSelector("button[id='mousehover']"))).build().perform();
//	    a.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
//	    //a.moveToElement(driver.findElement(By.id("openwindow"))).click();
	    driver.get("https://www.amazon.com/");
	    Actions a = new Actions(driver);
	    a.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
	}

}
