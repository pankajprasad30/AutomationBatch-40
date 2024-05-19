package parallel_CrossBrow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Brow 
{
	WebDriver driver;
	@Test
	@Parameters("browser_1")
	public void word1(String pankaj)
	{
		if(pankaj.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		if(pankaj.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(pankaj.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	
	

}
