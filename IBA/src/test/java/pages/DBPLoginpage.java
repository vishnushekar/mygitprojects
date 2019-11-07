package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBPLoginpage {

	WebDriver driver;

	public DBPLoginpage() {
	}

	public DBPLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='loginId']")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "submitDiv")
	WebElement Go;

	public WebElement username() {
		return username;

	}

	public WebElement password() {
		return password;

	}

	public WebElement Submit() {
		return Go;

	}

	public WebDriver getDriver() {
		return driver;
	}
}