package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Login_Amazon;

public class TestCase_3 extends Launch_Quit
{
	//Login into amazon website with invalid credentials.
		@Test
		public void Login_Amazon_Wronng_UN_PSWD3()
		{
			Login_Amazon h1=new Login_Amazon(driver);
			h1.hoverover(driver);
			h1.signin_button();
			h1.username_wrong();
			h1.continue_button();
			h1.password_wrong();
			h1.signin_button_1();
		}


}
