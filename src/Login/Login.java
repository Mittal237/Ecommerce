package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	By email = By.id("ap_email");
	By password = By.id("ap_password");
	By btnContinue= By.id("continue");
	By signin = By.id("signInSubmit");

	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	//set email
	public void setEmail(String strEmail) {	
		driver.findElement(email).sendKeys(strEmail);
	}
	public void clickContinue() {
		driver.findElement(btnContinue).click();
	}
	
	//set password
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	
	
	
	//click signIn button
	public void clickSignIn() {
		
		driver.findElement(signin).click();
	
	}
	

	
	public void loginToAmazon(String strEmail,String strPassword){

        //Fill user name

        this.setEmail(strEmail);
        this.clickContinue();

        //Fill password

        this.setPassword(strPassword);
        
        //Click Login button
        this.clickSignIn();       
    }
	
  

}
	