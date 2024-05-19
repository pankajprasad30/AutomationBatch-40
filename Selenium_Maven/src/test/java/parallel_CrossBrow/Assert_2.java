package parallel_CrossBrow;

import java.time.Duration;

import org.openqa.selenium.By;import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_2 
{

	@Test
	public void method_1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("india");
		w1.sendKeys(Keys.ENTER);
		
		
		
		Assert.assertEquals(driver.getTitle(),"india - Google Search");
		
		
	}

}
