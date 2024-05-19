package source_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Amazon 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	public void search_shoe()
	{
		search.sendKeys("Shoe");
		search.sendKeys(Keys.ENTER);
	}
	public Search_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class=\"a-icon a-icon-checkbox\"]")
	WebElement get_it_today;
	
	public void Get_It_Today()
	{
		get_it_today.click();
	}

}
