package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_3 
{
	@Test(dataProvider= "listofcity")
	public void method8(String input)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys(input);
		w1.sendKeys(Keys.ENTER);
	}
	@DataProvider(name="listofcity")
	public Object[][] method2()
	{
		return new Object[][] {{"varanasi"},{"bhatinda"},{"mumbai"},{"jalandhar"},{"moga"},{"abohar"}};
		
	}

}
