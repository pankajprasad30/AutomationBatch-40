//Launch Amazon login to the application using hoverovering functionality and proceed login
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_27 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1= new Actions(driver);// Remember this
		a1.moveToElement(w1).perform();
		driver.findElement(By.className("nav-action-inner")).click();
		
		

	}

}
