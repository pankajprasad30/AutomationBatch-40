package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Home_Amazon;
import source_Amazon.ProductPage_Amazon;

public class TestCase_15 extends Launch_Quit
{
	//reach till cart page without login in amazon application
	
	@Test
	public void without_login()
	{
		Home_Amazon h1=new Home_Amazon(driver);
		h1.shoe_search();
		h1.Shoe_Click(driver);
		
		ProductPage_Amazon p1=new ProductPage_Amazon(driver);
		p1.add_to_cart();
		//Thread.sleep(2000);
		p1.proceed_to_buy();
	
	}

}
