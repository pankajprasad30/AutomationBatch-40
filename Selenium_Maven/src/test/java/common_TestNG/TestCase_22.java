package common_TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase_22 extends Launch_Quit
{
	@Test(dependsOnMethods="login")
	public static void Test_Case()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");	
	}

}
