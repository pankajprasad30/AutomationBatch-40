package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCases_Reporter_Log 
{
	@Test 
	public static void flipkart_launch()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.co.in/");
		
		Reporter.log("Testing launching of flipkart via TestNG");
	}

}
