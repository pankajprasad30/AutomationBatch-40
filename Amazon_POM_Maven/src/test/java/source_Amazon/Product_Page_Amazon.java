package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page_Amazon 
{
	@FindBy(id="add-to-cart-button")
	WebElement Add_To_Cart;
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceed_to_cart;
	@FindBy(id="wishListMainButton")
	WebElement Wishlist;
	@FindBy(xpath="//a[.='View Your List']")
	WebElement View_List_Button;
	
	
	public void Add_Cart()
	{
		Add_To_Cart.click();
	}
	public void Proceed_Cart()
	{
		proceed_to_cart.click();
	}
	public void wishlist()
	{
		Wishlist.click();
	}
	public void View_Your_List()
	{
		View_List_Button.click();
	}
	
	public Product_Page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
