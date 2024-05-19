package cross_KT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Links_All {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> Link=driver.findElements(By.tagName("a"));
		System.out.println("Total number or flipkart links are :" +Link.size());
		
		for (int i=0;i<Link.size();i++)
		{
			WebElement w1=Link.get(i);
			//String s1=w1.getAttribute("href");
			//System.out.println(s1);
			System.out.println(w1.getText());
			
		}
		

	}

}
