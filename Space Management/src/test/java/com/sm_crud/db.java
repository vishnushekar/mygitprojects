package com.sm_crud;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class db extends Baseclass {
	/**
	 * @throws InterruptedException
	 */
	@Test
	public void Configuration() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Configuration']")).click();
		// driver.findElement(By.xpath("//div[@class ='desc custom-desc
		// ng-binding']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Space']")).click();
		// switch to new tab

		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String mainWindow = itr.next();
		String Childwindow = itr.next();
		driver.switchTo().window(Childwindow);
		System.out.println(driver.switchTo().window(Childwindow).getTitle());
		System.out.println(driver.switchTo().window(mainWindow).getTitle());
		driver.switchTo().window(Childwindow);
		driver.findElement(By.id("iconLevele2_2")).click();
		driver.findElement(By.id("level3Content_3")).click();
	}

	@Test
	public void createuser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[text()='Add Workstation']")).click();
		driver.findElement(By.id("name")).sendKeys("dbook");
		driver.findElement(By.id("shortName")).sendKeys("db");
		// Workstation type
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select ws = new Select(driver.findElement(By.id("workstationType")));
		ws.selectByVisibleText("Cabin");
		// Use as
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select ua = new Select(driver.findElement(By.id("useAsType")));
		ua.selectByVisibleText("Fixed Seat");
		// Seat number
		driver.findElement(By.id("seatNumber")).sendKeys("115");
		driver.findElement(By.id("areaSqrFeet")).sendKeys("22");
		// Site
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select site = new Select(driver.findElement(By.id("siteId")));
		site.selectByVisibleText("FT Bangalore");
		// Building
		Select building = new Select(driver.findElement(By.id("buildingId")));
		building.selectByVisibleText("FT-BLR-Bldg1");
		// Floor
		Select floor = new Select(driver.findElement(By.id("floorId")));
		floor.selectByVisibleText("GF");
		// Wing
		Select wing = new Select(driver.findElement(By.id("wingId")));
		wing.selectByVisibleText("Wing1");
		// layout
		Select layout = new Select(driver.findElement(By.id("layoutId")));
		layout.selectByVisibleText("FT-BLR-B1-G1");
		Thread.sleep(2000);
		// Allocation
		Select allocate = new Select(driver.findElement(By.id("allocatableType")));
		allocate.selectByVisibleText("Organization");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();

	}

	@Test
	public void viewuser() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-chevron-left']")).click();
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement search = driver.findElement(By.xpath("//input[@ng-model='searchSummary']"));
			search.click();
			search.sendKeys("dboo");
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='dbook']")));

			driver.findElement(By.xpath("//span[@title='Modify']")).click();
		} catch (Exception e) {
			System.out.println("EXCEPTION" + e.getMessage());
			e.printStackTrace();
		}
		driver.findElement(By.id("name")).sendKeys("dbook");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).sendKeys("dbook");
		driver.findElement(By.id("shortName")).sendKeys("db");
		// Workstation type
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select ws = new Select(driver.findElement(By.id("workstationType")));
		ws.selectByVisibleText("Cabin");
		// Use as
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select ua = new Select(driver.findElement(By.id("useAsType")));
		ua.selectByVisibleText("Fixed Seat");
		// Seat number
		driver.findElement(By.id("seatNumber")).sendKeys("1115");
		driver.findElement(By.id("areaSqrFeet")).sendKeys("2211");
		// Site
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select site = new Select(driver.findElement(By.id("siteId")));
		site.selectByVisibleText("FT Bangalore");
		// Building
		Select building = new Select(driver.findElement(By.id("buildingId")));
		building.selectByVisibleText("FT-BLR-Bldg1");
		// Floor
		Select floor = new Select(driver.findElement(By.id("floorId")));
		floor.selectByVisibleText("1F");
		// layout
		/*
		 * Select layout = new Select(driver.findElement(By.id("layoutId")));
		 * layout.selectByVisibleText("FT-BLR-B1-G1"); Thread.sleep(2000);
		 */
		// Allocation
		Select allocate = new Select(driver.findElement(By.id("allocatableType")));
		allocate.selectByVisibleText("General Pool");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();

	}

	public void delete() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-chevron-left']")).click();
		WebElement wb = driver.findElement(By.xpath("//input[@ng-model='searchSummary']"));
		wb.click();
		wb.sendKeys("dbook");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='dbook']")));

		driver.findElement(By.xpath("//span[@title='Delete']")).click();
		driver.switchTo().alert().accept();
	}

}
