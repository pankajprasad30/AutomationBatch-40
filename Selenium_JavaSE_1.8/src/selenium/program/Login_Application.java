package selenium.program;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Application {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("pankaj4798@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pankaj@21354564");
	    driver.findElement(By.name("login")).click();		

	}

}
