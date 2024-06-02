package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Home_Amazon;
import source_Amazon.Login_Amazon;

public class TestCase_5 extends Launch_Quit
{
	//Test searching for products using its name like shoes
	@Test
	public void Shoe_Search()
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
		
	}

}
