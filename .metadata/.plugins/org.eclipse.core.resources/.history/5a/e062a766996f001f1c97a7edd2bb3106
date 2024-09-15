package testNG_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Assertion 
{
	@Test
	public void add()
	{
		//Assert.assertTrue(false);
		//Assert.assertTrue(true);
		//Assert.assertFalse(false);
		//Assert.assertFalse(true);
		//Assert.assertEquals(true, false);
		//Assert.assertEquals(10, 0,"TestCaseFail");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String Amazon_Title=driver.getTitle();
		Assert.assertEquals(Amazon_Title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Using assertion for verification");
	}

}
