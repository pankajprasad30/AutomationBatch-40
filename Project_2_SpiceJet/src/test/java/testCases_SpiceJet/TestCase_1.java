package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;
import source_SpiceJet.SignUp_Page_SpiceJet;

public class TestCase_1 extends Launch_Quit
{
	@Test
	public void SingUp1()
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.signup(driver);
		
		SignUp_Page_SpiceJet s1=new SignUp_Page_SpiceJet(driver);
		s1.title_dropdown(driver);
		s1.FirstName_TextField();
		s1.LastName_TextField();
		s1.country_dropdown(driver);
		s1.Date_button();
		s1.month_dropdown(driver);
		s1.year_dropdown(driver);
		s1.date_selection();
		s1.mobile_no();
		s1.email(driver);
		s1.password();
		s1.con_password();
		s1.checkbox();
		s1.submit();
		
	}
	
	
}

