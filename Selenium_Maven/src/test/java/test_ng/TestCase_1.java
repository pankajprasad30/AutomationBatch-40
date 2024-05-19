package test_ng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestCase_1 
{
	@Test (priority=1) // Annotations of Test NG
	public static void add()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.googdsdasdasdasdasle.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	@Test  // Annotations of Test NG
	public static void sub()
	{
		System.out.println("Pankaj");		
	}
}
