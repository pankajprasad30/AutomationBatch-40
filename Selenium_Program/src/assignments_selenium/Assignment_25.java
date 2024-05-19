//Launch GroTechMinds website and do the Registration, here type the first name, 
//copy the first name and paste it in the last name Ctrl+A, Ctrl+C and Ctrl+V using keys functionality
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_25 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Pankaj");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+ "A");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+ "C");
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+ "V");
		
		
		

	}

}
