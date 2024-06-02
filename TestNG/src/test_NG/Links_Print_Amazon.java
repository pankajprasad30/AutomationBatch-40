package test_NG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Links_Print_Amazon 
{
	@Test
	public void broken_links()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i=0;i<links.size();i++)
		{
			WebElement w1=links.get(i);
			String s1=w1.getAttribute("href");
			System.out.println(s1);
			//System.out.println(w1.getText());
		}

		
	}

}
