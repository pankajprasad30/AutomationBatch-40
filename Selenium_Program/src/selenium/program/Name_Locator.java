package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {

	public static void main(String[] args) 
	{
		ChromeDriver c1= new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.facebook.com/");
		c1.findElement(By.name("email")).sendKeys("PankajPrasad30");


	}

}
