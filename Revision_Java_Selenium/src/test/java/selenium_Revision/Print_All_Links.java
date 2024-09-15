package selenium_Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Links {

	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.bigbasket.com/");
		 List<WebElement> Links_All=driver.findElements(By.tagName("a"));
		 int i1=Links_All.size();
		 System.out.println(i1);
		 for(int i=0;i<Links_All.size()-1;i++)
		 {
			 WebElement w1=Links_All.get(i);
			 //String s1=w1.getAttribute("href");
			// System.out.println(s1);
			 String s2=w1.getText();
			 System.out.println(s2);
		 }
		 

	}

}
