package source_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Payment_Page_Amazon 
{
	@FindBy(xpath="(//input[@class='a-button-input'])[2]") 
	WebElement UseThisAddress_Button;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement Radio_Button_card;
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement coupon_code;
	
	public void use_this_address()
	{
		UseThisAddress_Button.click();
	}
	public void radio_button_card()
	{
		Radio_Button_card.click();
	}
	public void coupon_code()
	{
		coupon_code.sendKeys("123456789");
		coupon_code.sendKeys(Keys.ENTER);
		
	}
	
	public Checkout_Payment_Page_Amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
