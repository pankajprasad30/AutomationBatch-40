package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retry_1 
{
	WebDriver driver;
	@Test
	public void retry_3()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("p"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
	//@Override
	//public boolean retry(ItestResult arg0)
	{
		
	}

}
