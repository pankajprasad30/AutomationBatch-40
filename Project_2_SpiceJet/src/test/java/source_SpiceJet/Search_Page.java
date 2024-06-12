package source_SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page 
{
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement Search_Continue_Button;
	
	public void search_continue_button()
	{
		Search_Continue_Button.click();
	}
	
	public Search_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
