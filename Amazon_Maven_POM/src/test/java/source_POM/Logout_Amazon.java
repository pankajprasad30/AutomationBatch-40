package source_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Amazon 
{
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Hoverover_Signout;
	
	//@FindBy(linkText="Sign Out")
	//WebElement sign_out;
	
	public void hoverover_signout() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement a2=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions b2=new Actions(driver);
		b2.moveToElement(a2).perform();
		driver.findElement(By.linkText("Sign Out")).click();
	}
	/*public void Sign_Out()
	{
		sign_out.click();
	}*/
	public Logout_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}