package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page_Amazon 
{
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Hoverover;
	
	@FindBy(linkText="Sign Out")
	WebElement Sign_Out;
	
	public void logout_amazon()
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(Hoverover).perform();	
	}
	public void SignOut()
	{
		Sign_Out.click();	
	}
	
	public Logout_Page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
