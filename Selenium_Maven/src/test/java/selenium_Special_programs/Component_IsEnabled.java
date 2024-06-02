package selenium_Special_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_IsEnabled {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement w1=driver.findElement(By.id("1"));
		boolean b1=w1.isEnabled();
		if(b1==true)
		{
			w1.sendKeys("Pankaj");
		}
		else
		{
			System.out.println("Text Field is disabled");
		}

	}

}
