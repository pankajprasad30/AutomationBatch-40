package test.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.POM.Search;

public class TestCase2 
{
	@Test
	public void search() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Search s1=new Search(driver);
		s1.search_shoe();
		
        Thread.sleep(2000);
		
		driver.quit();
		
	}
}

