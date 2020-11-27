package SearchFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFunction {
	
	WebDriver driver;
	
	By searchText = By.id("twotabsearchtextbox");
	By cellCompatibility= By.xpath("//span[text()='Waterproof']");
	By cellColor = By.xpath("//li[@id='p_n_size_browse-vebin/2569827011']");
	By cellImage = By.cssSelector(".s-image");
	
	public SearchFunction(WebDriver driver) {
		this.driver = driver;
	}
	
	//set search box
	public void setSearchBox(String strText) {	
			driver.findElement(searchText).sendKeys(strText);
			
	}
	public void clickSearchButton() {	
		
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	}
	
	//set cell compatibility
	public void setCellType() {	
		driver.findElement(cellCompatibility).click();
	}
	
	//set color
	public void setColor() {
		driver.findElement(cellColor).click();
	}
	
	public void clickImage() {
		driver.findElement(cellImage).click();
	}
	
	public void clickProduct(String strText) {
		
		this.setSearchBox(strText);
		this.clickSearchButton();
		
		this.setCellType();
		this.setColor();
		this.clickImage();
		
		
	}
		
	

}
