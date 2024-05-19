package testCases_FB;

import org.testng.annotations.Test;

import source_FB.Login_FB;

public class TestCase_1 extends Launch_Quit
{
	
	@Test
	public void Login_to_FB()
	{
		Login_FB L1=new Login_FB(driver);
		L1.UN();
		L1.Pswd();
		L1.Lgn();
		
	}

}
