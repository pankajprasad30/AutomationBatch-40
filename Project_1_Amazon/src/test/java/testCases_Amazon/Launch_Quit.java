package testCases_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit 
{
	//Launch and quit of amazon application.
	WebDriver driver;
	@BeforeMethod
	public void Launch_Amazon()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void Quit_Amazon() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.quit();
	}

}
