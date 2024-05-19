package source.POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search 
{
	WebDriver driver;
	//step:1
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	//step:2
	public void search_shoe()
	{
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
	}
	//Step:3
	public Search(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
