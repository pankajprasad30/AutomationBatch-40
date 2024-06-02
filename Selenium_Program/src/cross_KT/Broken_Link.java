package cross_KT;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> Link=driver.findElements(By.tagName("a"));
		System.out.println("Total number or flipkart links are :" +Link.size());
		
		for (int i=0;i<Link.size();i++)
		{
			WebElement w1=Link.get(i);
			String s1=w1.getAttribute("href");
			//System.out.println(s1);
			//System.out.println(w1.getText());	
			link_verification(s1);
		}
	}
	static void link_verification(String s1) throws IOException
	{
		try 
		{
		URL url1=new URL(s1);
		HttpURLConnection url2=(HttpURLConnection) url1.openConnection();
		url2.connect();
		
			if(url2.getResponseCode()==200)
			{
				System.out.println("Link Is valid : " +url2.getResponseCode() +" " + url2.getResponseMessage()+" " + s1 );
			}

			else
			{
				System.out.println("Link Is not valid : "+ url2.getResponseCode() +" "+ url2.getResponseMessage()+" " +s1);
			}
		}
		catch (StaleElementReferenceException a1)
		{
			System.out.println("Exception is handled");
		}
		
	}

}
