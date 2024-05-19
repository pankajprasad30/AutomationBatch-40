package source.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_FB 
{
	WebDriver driver;
	//Step:1
	@FindBy(name="email")
	WebElement un_txtfld;
	
	@FindBy(id="pass")
	WebElement pswd_txtfld;
	
	@FindBy(xpath= "//button[@name='login']")
	WebElement login_button;
	
	//Step:2
	public void UN()
	{
		un_txtfld.sendKeys("pankajprasad@gmail.com");	
	}
	public void PSWD()
	{
		pswd_txtfld.sendKeys("Automation@123");
	}
	public void LOGN()
	{
		login_button.click();
	}
	
	
	//Step:3
	public Login_FB(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	

}
