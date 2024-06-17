package source_SpiceJet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page 
{
	@FindBy(id="card_number")
	WebElement Card_Number;
	@FindBy(id="name_on_card")
	WebElement Card_Holder_Name;
	@FindBy(id="card_exp_month")
	WebElement Expiry_Month;
	@FindBy(id="card_exp_year")
	WebElement Expiry_Year;
	@FindBy(id="security_code")
	WebElement CVV_Number;
	@FindBy(linkText="Proceed to pay")
	WebElement Procced_To_Pay_Button;
	
	public void card_number()
	{
		Card_Number.sendKeys("123443211234");
	}
	public void card_holder_name()
	{
		Card_Holder_Name.sendKeys("Pankaj Prasad");
	}
	public void expiry_month()
	{
		Expiry_Month.sendKeys("12");
	}
	public void expiry_year()
	{
		Expiry_Year.sendKeys("2027");
	}
	public void cvv_number()
	{
		CVV_Number.sendKeys("123");
	}
	public void proceed_to_pay_button()
	{
		Procced_To_Pay_Button.click();
	}
	
	public Payment_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
