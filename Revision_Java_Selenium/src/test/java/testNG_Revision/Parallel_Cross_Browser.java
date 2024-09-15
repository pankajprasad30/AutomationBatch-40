package testNG_Revision;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Cross_Browser 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Launch_Browser(String Browsername)
	{
		if(Browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(Browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
	}
	

}