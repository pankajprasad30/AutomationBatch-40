package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Login_Amazon;
import source_Amazon.Order_Page_Amazon;

public class TestCase_14 extends Launch_Quit
{
	// Go to orders page and click on your last ordered product and give 5 star ratings
	//Since i have not ordered anything in this account to will it later
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
		
		Order_Page_Amazon o1=new Order_Page_Amazon(driver);
		o1.order_history();
				
	}

}
