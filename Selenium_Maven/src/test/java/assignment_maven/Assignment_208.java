//Take screeshot before quiting the browser in both the methods usingTestNG
package assignment_maven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

import selenium.program.Screenshot_1;

public class Assignment_208 
{
	static WebDriver driver;
	@BeforeMethod
	public static void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public static void Test_Case()
	{
		driver.get("https://www.google.com");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("India");	
		w1.sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void quit() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		TakesScreenshot t1=(TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Pankaj Prasad\\Desktop\\Selenium Screenshot\\.jpeg");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);
		driver.quit();
		
	}


}
