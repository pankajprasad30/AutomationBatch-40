package testNG_Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Two_Dimensonal_DataProvider 
{
	@Test(dataProvider="data")
	public void Facebook(String Username, String Password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
	}
	@DataProvider(name="data")
	public Object[][] dataforfacebook()
	{
		Object[][] o1=new Object[2][2];
		o1[0][0]="pankaj@gmail.com";
		o1[0][1]="Automation@123";
		o1[1][0]="prasad@gmail.com";
		o1[1][1]="TestNG@123";
		return o1;
		
	}

}
