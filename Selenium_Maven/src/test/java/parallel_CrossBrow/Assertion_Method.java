package parallel_CrossBrow;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertion_Method 
{
	@Test
	public void fan()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w1=driver.findElement(By.name("p"));
		w1.sendKeys("india");
		//Assert.assertTrue(false);
	}
	@Test (dependsOnMethods="fan")
	public void fan1()
	{
		//Assert.assertTrue(true);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("india");
	}


}
