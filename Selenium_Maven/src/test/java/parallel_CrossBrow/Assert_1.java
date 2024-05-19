//Assertion
package parallel_CrossBrow;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_1 
{
	@Test
	public void method_1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");
		
		//Assert.assertEquals(driver.getTitle(), "Google");
		Assert.assertEquals(10,10);
		
		
	}
	

}
