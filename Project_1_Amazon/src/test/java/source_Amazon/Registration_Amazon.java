package source_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Amazon 
{
	//Registration of new user page
	@FindBy(linkText="Start here.")
	WebElement StartHere_Button;
	@FindBy(id="ap_customer_name")
	WebElement Customer_Name_TextField;
	@FindBy(id="ap_phone_number")
	WebElement MobileNo_TextField;
	@FindBy(id="ap_password")
	WebElement Password_TextField;
	@FindBy(id="continue")
	WebElement VerifyMobileNo_Button;
	
	public void starthere_button()
	{
		StartHere_Button.click();
	}
	public void customer_name()
	{
		Customer_Name_TextField.sendKeys("Pankaj Prasad");
	}
	public void Mobile_No()
	{
		MobileNo_TextField.sendKeys("9930034615");
	}
	public void password()
	{
		Password_TextField.sendKeys("Welcome@_123");
	}
	public void verify_button()
	{
		VerifyMobileNo_Button.click();
	}
	
	public Registration_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
