package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Checkout_Payment_Page_Amazon;
import source_Amazon.Home_Amazon;
import source_Amazon.Login_Amazon;
import source_Amazon.ProductPage_Amazon;

public class TestCase_13 extends Launch_Quit
{
	//check if user is able to apply coupon code while ordering the product
	@Test
	public void coupon_code() throws InterruptedException
	{
		Login_Amazon l1=new Login_Amazon(driver);
		l1.hoverover(driver);
		l1.signin_button();
		l1.username();
		l1.continue_button();
		l1.password();
		l1.signin_button_1();
		
		Home_Amazon h1=new Home_Amazon(driver);
		h1.shoe_search();
		h1.Shoe_Click(driver);
		
		ProductPage_Amazon p1=new ProductPage_Amazon(driver);
		p1.add_to_cart();
		Thread.sleep(2000);
		p1.proceed_to_buy();
		
		Checkout_Payment_Page_Amazon c1=new Checkout_Payment_Page_Amazon(driver);
		c1.use_this_address();
		c1.coupon_code();
	}

}
