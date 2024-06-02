package selenium_Special_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Component_IsSelected {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement w1=driver.findElement(By.id("123"));
		//w1.click();
		boolean b1=w1.isSelected();
		if(b1==true)
		{
			System.out.println("Already selected");
		}
		else
		{
			w1.click();
		}

	}

}
