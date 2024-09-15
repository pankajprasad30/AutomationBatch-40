package testNG_Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_TestNG 
{
	static WebDriver driver;

	@Test
	public static void addition()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	}
	@BeforeMethod
	public static void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	
	}
	@AfterMethod
	public static void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}
