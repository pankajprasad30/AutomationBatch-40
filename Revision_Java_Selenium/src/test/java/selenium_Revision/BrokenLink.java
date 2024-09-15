package selenium_Revision;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink 
{
	static void Broken_Link(String link_print) throws IOException 
	{
		try
		{
			URL url1=new URL(link_print);
			HttpURLConnection url2=(HttpURLConnection) url1.openConnection();
			url2.connect();
			if(url2.getResponseCode()==200)
			{
				System.out.println("Link is in working condition"+url2.getResponseCode()+" : "+link_print);
			}
			else
			{
				System.out.println("Links are broken"+url2.getResponseCode()+" : "+link_print);
			}
		}
		catch(IOException p1)
		{
			System.out.println("Exception is handled");
		}
		
	}

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int count=l1.size();
		System.out.println(count);
		
		for (int i=0;i<l1.size();i++)
		{
			WebElement w1=l1.get(i);
//			String Text_value=w1.getText();
//			System.out.println(Text_value);
			
			String link_print=w1.getAttribute("href");
			System.out.println(link_print);
			Broken_Link(link_print);
		}

	}

}
