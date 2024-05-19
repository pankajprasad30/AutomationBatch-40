package testCases_POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import source_POM.Login_Amazon;
import source_POM.Search_Amazon;

public class TestCase3 
{
	WebDriver driver;
	@Test
	public void login_to_payment()
	{
		Launch_And_Quit l9=new Launch_And_Quit();
		l9.Amazon_Launch();
		
		Login_Amazon l6=new Login_Amazon(driver);
		l6.un1();
		l6.cont();
		l6.pswd();
		l6.signin();
		
		Search_Amazon l7=new Search_Amazon(driver);
		l7.search_shoe();
		
		
	}

}
