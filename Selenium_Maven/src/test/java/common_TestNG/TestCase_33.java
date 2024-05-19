package common_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_33 extends Launch_Quit
{
	@Test
	public static void Test_Case()
	{
		driver.get("https://www.google.com");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("India");	
		w1.sendKeys(Keys.ENTER);
	}

}
