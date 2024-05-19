package iretry_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_9 
{
	@Test (retryAnalyzer=iretry_pack.IRetry_Analyser.class)
	public void google_search()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement w1=driver.findElement(By.name("pqqq"));
	w1.sendKeys("India");
	w1.sendKeys(Keys.ENTER);
	}

}
