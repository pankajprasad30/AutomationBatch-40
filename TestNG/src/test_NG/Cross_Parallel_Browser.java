package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Parallel_Browser 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Launch_Browser(String BrowserName)
	{
		if(BrowserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if(BrowserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		if(BrowserName.equals("Edge"))
		{
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
	}

}
