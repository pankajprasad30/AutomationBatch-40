package source_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Amazon 
{
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement Manage_profile_Button;
	@FindBy (linkText="View")
	WebElement View_Button;
	@FindBy(id="twotabsearchtextbox")
	WebElement Search_Shoe;
	@FindBy(xpath="(//span[@class=\"a-size-base a-color-base\"])[6]")
	WebElement Category_Click;
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement shoe_click;
	@FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	WebElement Short_By_Rating;
	
	public void manage_profile()
	{
		Manage_profile_Button.click();
	}
	public void view_button()
	{
		View_Button.click();
	}
	public void shoe_search()
	{
		Search_Shoe.sendKeys("Shoes");
		Search_Shoe.sendKeys(Keys.ENTER);
	}
	public void category_click()
	{
		Category_Click.click();
	}
	public void Shoe_Click(WebDriver driver)
	{
		shoe_click.click();
		Set<String> Browser_ID=driver.getWindowHandles();
		Iterator<String> i1=Browser_ID.iterator();
		String Parent_Browser_ID=i1.next();
		String Child_Browser_ID=i1.next();
		driver.switchTo().window(Child_Browser_ID);
	}
	public void short_by_rating()
	{
		Short_By_Rating.click();
	}
	
	
	public Home_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
