package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Page_Amazon 
{
	@FindBy(id="nav-orders")
	WebElement Order_History;
	
	public void order_history()
	{
		Order_History.click();
	}
	
	public Order_Page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
