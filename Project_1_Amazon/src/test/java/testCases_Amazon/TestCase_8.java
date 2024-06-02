package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Home_Amazon;
import source_Amazon.Login_Amazon;

public class TestCase_8 extends Launch_Quit
{
	//check if product can be sorted by relevance, price,rating etc.
	@Test
	public void Shorting_By_Rating()
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
		//h1.Shoe_Click(driver);
		h1.short_by_rating();
		
		
	}
	

}
