//Open FB registration page type name and copy and paste same name in last name field
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_36 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Pankaj");
		driver.findElement(By.name("firstname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("firstname")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("lastname")).sendKeys(Keys.CONTROL+"v");
		

	}

}
