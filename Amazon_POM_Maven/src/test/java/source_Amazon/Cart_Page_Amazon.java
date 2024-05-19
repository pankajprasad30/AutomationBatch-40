package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page_Amazon 
{
	@FindBy(xpath="//a[@class='a-button-text a-text-center']")
	WebElement Add_cart;
	
	public void add_to_cart()
	{
		Add_cart.click();
	}
	
	public Cart_Page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
