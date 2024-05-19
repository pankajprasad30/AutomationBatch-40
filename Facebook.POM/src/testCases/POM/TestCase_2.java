package testCases.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.POM.Login_FB;

public class TestCase_2 
{
	@Test
	public void photo_post()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login_FB a1=new Login_FB(driver);
		a1.UN();
		a1.PSWD();
		a1.LOGN();
		
	}

}
