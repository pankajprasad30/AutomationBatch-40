package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Amazon 
{
	// Source code for login into amazon with valid credentials
	//Step:1
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Hoverover;
	@FindBy(linkText="Sign in")
	WebElement SignIn_Button;
	@FindBy(id="ap_email")
	WebElement UserName_TextField;
	@FindBy(id="continue")
	WebElement Continue_Button;
	@FindBy(id="ap_password")
	WebElement Password_TextField;
	@FindBy(id="signInSubmit")
	WebElement SignIn_Button_1;
	
	//Step:2
	public void hoverover(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(Hoverover).perform();
	}
	public void signin_button()
	{
		SignIn_Button.click();
	}
	public void username()
	{
		UserName_TextField.sendKeys("pankajprasad4798@gmail.com");
	}
	public void username_wrong()
	{
		UserName_TextField.sendKeys("pankajprasad98@gmail.com");
	}
	public void continue_button()
	{
		Continue_Button.click();
	}
	public void password()
	{
		Password_TextField.sendKeys("Automation@123");
	}
	public void password_wrong()
	{
		Password_TextField.sendKeys("Automatiodqwdqweqwn@123");
	}
	public void signin_button_1()
	{
		SignIn_Button_1.click();
	}
	
	//Step:3
	public Login_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
