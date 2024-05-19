//Write A Code To Select Demo2 Using Select By Visible Text.
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment_23 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		//Thread.sleep(1000);
		WebElement drop=driver.findElement(By.id("Choice1"));
		Select s1=new Select(drop);
		s1.selectByVisibleText("Demo2");

	}

}
