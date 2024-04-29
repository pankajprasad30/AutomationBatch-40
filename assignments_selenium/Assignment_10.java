//Program to launch Facebook and Login
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_10 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("pankajprasad4798@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Ambani@123");
        driver.findElement(By.name("login")).click();

	}

}
