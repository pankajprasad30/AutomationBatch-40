package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTest_7 
{
	    static WebDriver driver;
		@BeforeMethod
		public static void launch()// WebDriver driver=new ChromeDriver();
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@Test
		public static void Test_Case()
		{
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys("India");
			
			
		}
		@AfterMethod
		public static void quit() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.quit();
			
		}

	

}
