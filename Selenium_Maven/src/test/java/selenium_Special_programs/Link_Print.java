package selenium_Special_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Print {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<links.size()-1;i++)
		{
			WebElement w1=links.get(i);
			String s1=w1.getAttribute("href");
			//System.out.println(s1); // for printing all links
			String text=w1.getText();
			System.out.println(text);// for printing link text
		}

	}

}
