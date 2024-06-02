package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Home_Amazon;
import source_Amazon.Login_Amazon;
import source_Amazon.ProductPage_Amazon;

public class TestCase_10 extends Launch_Quit
{
	//Test updating item quantities and removing items from the cart
	@Test
	public void cart_add_remove() throws InterruptedException
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
		p1.go_to_cart();
		Thread.sleep(2000);
		p1.product_delete();
		
	}

}
