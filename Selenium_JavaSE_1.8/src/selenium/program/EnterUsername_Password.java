package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUsername_Password {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://grotechminds.com/registration");
		a1.findElement(By.id("fname")).sendKeys("Pankaj");
		a1.findElement(By.id("lname")).sendKeys("Prasad");
		a1.findElement(By.id("Username")).sendKeys("PankajPrasad");
		a1.findElement(By.id("password")).sendKeys("Pankaj@123");

	}

}
