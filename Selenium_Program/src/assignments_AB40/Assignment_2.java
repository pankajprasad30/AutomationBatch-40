//Login to google and search for India using search button.
package assignments_AB40;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();// maximise browser
		driver.get("https://www.google.com/");// navigate to URL
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.className("gNO89b")).click();
	}

}
