package testNG_Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_YouTube 
{
	static WebDriver driver;
	//String YouTube_Data;
	@Test (dataProvider="data")
	public static void YouTube(String YouTube_Data)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(YouTube_Data);	
	}
	@DataProvider(name="data")
	public static  Object[][] Youtube()
	{
		return new Object[][] {{"India"},{"USA"},{"Canada"}};
		
	}

}
