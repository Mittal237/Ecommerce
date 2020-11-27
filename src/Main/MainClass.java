package Main;

import org.testng.annotations.Test;

import AddToCart.AddToCart;
import HomePage.HomePage;
import Login.Login;
import Logout.Logout;
import SearchFunction.SearchFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class MainClass {
	String driverPath = "/Users/ompatel/Downloads/chromedriver";
	WebDriver driver;
	Login loginObj;
	HomePage homepageObj;
	SearchFunction searchObj;
	AddToCart addCartObj;
	Logout logoutObj;
	

	
 
  @BeforeTest
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://www.amazon.com/");
      
      Actions actions= new Actions(driver);
      WebElement target = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
      actions.moveToElement(target).perform();
      
      driver.findElement(By.cssSelector(".nav-action-inner")).click();
//      
//      driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
      

      System.out.println("title of the page: " + driver.getTitle());
  }
  
  @Test(priority = 0)
  public void check_signin_test_correct() {
	  loginObj = new Login(driver);
	  loginObj.loginToAmazon("mittal161195@gmail.com", "Mittal@1234");
	  homepageObj = new HomePage(driver);
	  
	  Assert.assertTrue(homepageObj.getHomePageDashboardUserName().toLowerCase().contains("hello,"));
  }
  
  @Test(priority = 1)
  public void select_product() {
	  searchObj = new SearchFunction(driver);
	  searchObj.clickProduct("iphone 11 pro max case");
	    
  }
  @Test(priority=2)
  public void check_add_to_cart_item() {
	  addCartObj = new AddToCart(driver);
	  addCartObj.check_add_to_cart();
  }
  
  @Test(priority=3)
  public void check_logout_correct() {
	  Actions actions = new Actions(driver);
	    WebElement target = driver.findElement(By.xpath("//span[@class='nav-line-1']"));
	    actions.moveToElement(target).perform();
	    
	  logoutObj = new Logout(driver);
	  WebElement target1 = driver.findElement(By.xpath("//span[text()='Hello, Mittal']"));
      actions.moveToElement(target1).perform();
	  logoutObj.check_sign_out();
  }

}
