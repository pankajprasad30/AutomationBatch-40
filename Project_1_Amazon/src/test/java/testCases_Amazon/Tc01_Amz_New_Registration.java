package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Login_Amazon;
import source_Amazon.Registration_Amazon;

public class TestCase_1 extends Launch_Quit
{
	// test if a new user can successfully register.
	@Test
	public void Registration_Amazon()
	{
		Login_Amazon h1=new Login_Amazon(driver);
		h1.hoverover(driver);
		
		Registration_Amazon r1=new Registration_Amazon(driver);
		r1.starthere_button();
		r1.customer_name();
		r1.Mobile_No();
		r1.password();
		r1.verify_button();
		
	}

}
