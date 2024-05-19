package assignment_maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_207 
{
	WebDriver driver;
	@BeforeMethod
	public void launch_browser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void testcase1()
	{
	WebElement serach=			driver.findElement(By.name("q"));
	serach.sendKeys("Sachin");

	}
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();

	}
}


