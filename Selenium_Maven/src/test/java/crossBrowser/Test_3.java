package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_3 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void sub(String pankaj)
	{
		if(pankaj.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(pankaj.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(pankaj.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("India");
		w1.sendKeys(Keys.ENTER);
		
	}

}
