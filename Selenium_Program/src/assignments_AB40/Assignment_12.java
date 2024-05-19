//launch google type India, press enter button
package assignments_AB40;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_12 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();// maximise browser
		driver.get("https://www.google.com/");// navigate to URL
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		

	}

}
