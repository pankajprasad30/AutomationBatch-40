package testCases_Amazon;

import org.testng.annotations.Test;

import source_Amazon.Login_Amazon;

public class TestCase_2 extends Launch_Quit
{
	//Login into amazon website with valid credentials.
	@Test
	public void Login_Amazon2()
	{
		Login_Amazon h1=new Login_Amazon(driver);
		h1.hoverover(driver);
		h1.signin_button();
		h1.username();
		h1.continue_button();
		h1.password();
		h1.signin_button_1();	
	}

}
