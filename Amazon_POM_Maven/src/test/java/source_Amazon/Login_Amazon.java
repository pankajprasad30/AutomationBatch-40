package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Amazon 
{
	//Step: 1
	@FindBy(id="ap_email")
	WebElement UserName;
	@FindBy(id="continue")
	WebElement Continue_Button;
	@FindBy(id="ap_password")
	WebElement Password;
	@FindBy(id="signInSubmit")
	WebElement SignIn_Button;
	//Step:2
	public void un_txtfld()
	{
		UserName.sendKeys("pankajprasad4798@gmail.com");
	}
	public void continue_button()
	{
		Continue_Button.click();
	}
	public void pswrd_txtfld()
	{
		Password.sendKeys("Automation@123");
	}
	public void signin_button()
	{
		SignIn_Button.click();
	}
	//Step:3
	
	public Login_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
