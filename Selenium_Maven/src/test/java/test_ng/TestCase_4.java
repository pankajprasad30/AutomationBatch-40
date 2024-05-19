package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase_4 
{
	@Test (timeOut=5000)// Camel case
	void div()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rediff.com/");
		driver.findElement(By.id("asdas")).click();
	}

}
