package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Home_Amazon;
import source_Amazon.Login_Amazon;

public class TestCase_6 extends Launch_Quit
{
	//Verify that searching with filters (e.g- category,price,range) yields accurate result
	@Test
	public void category_shoe()
	{
		Login_Amazon h1=new Login_Amazon(driver);
		h1.hoverover(driver);
		h1.signin_button();
		h1.username();
		h1.continue_button();
		h1.password();
		h1.signin_button_1();
		
		Home_Amazon h2=new Home_Amazon(driver);
		h2.shoe_search();
		h2.category_click();
	}

}
