package parallel_crossbrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_1 
{
	WebDriver driver;
	@Test
	//@Parameters ("browser")
	void Launch_Browser(String BrowserName)
	{
		if(BrowserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(BrowserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(BrowserName.equals("safari"))
		{
			driver=new SafariDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("India");
		w1.sendKeys(Keys.ENTER);
		
	}

}
