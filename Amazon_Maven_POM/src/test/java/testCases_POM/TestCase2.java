package testCases_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import source_POM.Login_Amazon;
import source_POM.Logout_Amazon;
import source_POM.Search_Amazon;

public class TestCase2 
{
	WebDriver driver;
	@Test
	public void login_to_logout() throws InterruptedException
	{
		Launch_And_Quit L1=new Launch_And_Quit();
		L1.Amazon_Launch();
		
		Login_Amazon l3=new Login_Amazon(driver);
		l3.un1();
		l3.cont();
		l3.pswd();
		l3.signin();
		
		Search_Amazon l4=new Search_Amazon(driver);
		l4.search_shoe();
		l4.Get_It_Today();
		
		Logout_Amazon l5=new Logout_Amazon(driver);
		l5.hoverover_signout();
		
		
		
		
		
	}
	

}
