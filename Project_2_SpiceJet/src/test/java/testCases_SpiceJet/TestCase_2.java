package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;

public class TestCase_2 extends Launch_Quit
{
	//validate login functionality with valid un & pswd
	@Test
	public void Login2() throws InterruptedException
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.login();
		h1.mobile_no();
		h1.password();
		Thread.sleep(2000);
		h1.login_button();
		
	}

}
