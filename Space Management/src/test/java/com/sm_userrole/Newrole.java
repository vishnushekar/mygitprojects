package com.sm_userrole;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Newrole extends Login {
	/**
	 * @throws InterruptedException
	 */

	@Test(priority=1)
	public void Configuration() throws InterruptedException {
		Thread.sleep(2000);
		wd.findElement(By.xpath("//div[text()='Configuration']")).click();
		// driver.findElement(By.xpath("//div[@class ='desc custom-desc
		// ng-binding']")).click();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//div[text()='Space']")).click();
		// switch to new tab
		String mainWindow = wd.getWindowHandle();
		Set<String> windowshandlers = wd.getWindowHandles();// assign window ID's to set
		Iterator<String> it = windowshandlers.iterator();
		while(it.hasNext()) {
			String childwindow = it.next();
			if(!mainWindow.equals(childwindow));{
				wd.switchTo().window(childwindow);
				System.out.println(wd.switchTo().window(childwindow).getTitle());
			}
		}
		// switch selenium control to second window.
		wd.findElement(By.id("iconLevele2_2")).click();
		wd.findElement(By.id("level3Content_3")).click();
	}
	@Test(priority =2)
	public void createuser() throws InterruptedException {
		Thread.sleep(2000);
		wd.findElement(By.xpath("//i[@class='fa fa-wrench']")).click();
		wd.findElement(By.xpath("//p[text()='User Role']")).click();
		WebDriverWait wait = new WebDriverWait(wd,20);
		WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Add User Role']")));
		w.click();
		wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wd.findElement(By.id("name")).sendKeys("v_test");
		wd.findElement(By.id("description")).sendKeys("v");
		// Workstation type
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select ws = new Select(wd.findElement(By.id("roleType")));
		ws.selectByVisibleText("Administrator");
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement submit = wd.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[text()='Permission']")).click();
		wd.findElement(By.id("menu_home_menu_home_View")).click();
		wd.findElement(By.id("menu_admin_menu_userrole_View")).click();
		wd.findElement(By.id("menu_admin_menu_userrole_Create")).click();
		wd.findElement(By.id("menu_admin_menu_userrole_Modify")).click();
		wd.findElement(By.id("menu_admin_menu_userrole_Delete")).click();
		wd.findElement(By.id("menu_admin_menu_userrole_Modify Permission")).click();
			
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement submit1 = wd.findElement(By.xpath("//button[text()='Submit']"));
		submit1.click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//span[@ng-show='navlevel3link']")).click();
			}
@Test(priority=3)
public void edituser() throws InterruptedException {
		Thread.sleep(3000);
		try {
			wd.findElement(By.xpath("//input[@ng-model='searchSummary']")).sendKeys("v_test");
			WebDriverWait wai1t = new WebDriverWait(wd,20);
			WebElement w2 = wai1t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='v_test']")));		
			Thread.sleep(2000);
			wd.findElement(By.xpath("//span[@title='Modify']")).click();
		}
		catch(Exception e) {
			System.out.print("Exception"+e.getMessage());
			e.printStackTrace();
		}
		wd.findElement(By.id("name")).sendKeys("vishnu_test");
		wd.findElement(By.id("description")).sendKeys("vishnu");
		
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement submit = wd.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[text()='Permission']")).click();
		wd.findElement(By.id("menu_home_menu_home_View")).click();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement submit1 = wd.findElement(By.xpath("//button[text()='Submit']"));
		submit1.click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[@ng-show='navlevel3link']")).click();
	
}
@Test(priority=4)
public void deleteuser() throws InterruptedException {
	Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@ng-model='searchSummary']")).sendKeys("v_test");
		WebDriverWait wai1t = new WebDriverWait(wd,20);
		WebElement w2 = wai1t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='v_test']")));	
		Thread.sleep(2000);
		wd.findElement(By.xpath("//span[@title='Delete']")).click();
		wd.switchTo().alert().accept();
		
	}
		
}
		
	



