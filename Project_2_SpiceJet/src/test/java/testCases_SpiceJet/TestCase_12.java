package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;
import source_SpiceJet.Logout_Page;

public class TestCase_12 extends Launch_Quit
{
	//login to spice ject search the flight and logout
	@Test
	public void login_search_logout() throws InterruptedException
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.login();
		h1.mobile_no();
		h1.password();
		Thread.sleep(2000);
		h1.login_button();
		
		Thread.sleep(3000);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		Thread.sleep(5000);
		
		Logout_Page l1= new Logout_Page(driver);
		l1.logout_click();
		l1.logout_button();
	}

}
