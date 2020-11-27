package AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	WebDriver driver;
	
//	By giftOption =  By.xpath("//span[text()='Add gift options']");
//	By giftOption = By.cssSelector(".a-label.a-checkbox-label");
	By addToCart = By.id("add-to-cart-button");
	By cartItems =  By.id("hlb-view-cart-announce");
	By deleteItem = By.xpath("//input[@value='Delete']");

	
	public AddToCart(WebDriver driver) {
		this.driver= driver;
		
	}
	
//	public void ClickGiftCheckbox() {
//		driver.findElement(giftOption).click();
//	}
	
	public void AddToCart() {
		driver.findElement(addToCart).click();
	}
	public void CartItems() {
		driver.findElement(cartItems).click();
	}
	
	public void DeleteItem() {
		driver.findElement(deleteItem).click();
	}
	
	public void check_add_to_cart() {
//		this.ClickGiftCheckbox();
		this.AddToCart();
		this.CartItems();
		this.DeleteItem();
	}

}
