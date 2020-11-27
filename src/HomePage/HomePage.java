package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By homePageUserName =  By.xpath("//span[text()='Hello, Mittal']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//get username 
	public String getHomePageDashboardUserName(){
	    System.out.println("username is: " + driver.findElement(By.xpath("//span[text()='Hello, Mittal']")).getText());
		
        return    driver.findElement(By.xpath("//span[text()='Hello, Mittal']")).getText();
    

       }

}
