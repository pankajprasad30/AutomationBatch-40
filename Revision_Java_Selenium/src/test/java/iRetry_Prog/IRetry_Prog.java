package iRetry_Prog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IRetry_Prog 
{
	@Test(retryAnalyzer=iRetry_Prog.IRetry_Logic.class)
	public void google()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		//Assert.assertTrue(false);
		driver.findElement(By.name("qpp")).sendKeys("India"+Keys.ENTER);
	}

}
