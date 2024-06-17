package source_SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page 
{
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[1]")
	WebElement Logout_Click;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj'])[1]")
	WebElement Logout_Button;
	
	public void logout_click()
	{
		Logout_Click.click();
	}
	public void logout_button()
	{
		Logout_Button.click();
	}
	
	
	
	public Logout_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
