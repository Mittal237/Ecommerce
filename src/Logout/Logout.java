package Logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout {
	WebDriver driver;
	
	

	By signOutLink = By.xpath("//span[text()='Sign Out']");
	
	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ClickSignOut() {
		driver.findElement(signOutLink).click();
	}
	
	public void check_sign_out() {
		this.ClickSignOut();
	}

}
