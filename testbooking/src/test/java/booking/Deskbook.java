package booking;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Deskbook extends Login {
	
	
  @Test(priority=0)
  public void createuser() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("")).click();
	  /*WebDriverWait wait  = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//div[@class ='desc custom-desc ng-binding']"))));
	  driver.findElement(By.xpath("//div[@class ='desc custom-desc ng-binding']")).click();*/
	  driver.findElement(By.xpath("//div[text()='Space']")).click();
	  // switch to new tab
		 
		 Set<String> windowshandlers = driver.getWindowHandles();//assign  window ID's to set
		 Iterator<String> it = windowshandlers.iterator();
		 String window1 = it.next();
		 String window2 = it.next();
		 driver.switchTo().window(window2);//switch selenium control to second window.
		 driver.findElement(By.xpath("//div[@id='iconLevele2_1']")).click();
  }  
  @Test(priority=1)
	  public void readuser() {
		  
	  
		  }
  @Test(priority=2)
  public void edituser() {
	  
  }
  @Test(priority=3)
  public void deleteuser() {
	  
  }
	  
	  
  public static void main(String[] args) throws InterruptedException {
	  Deskbook d = new Deskbook();
	  d.createuser();
	  
  }

	
}

