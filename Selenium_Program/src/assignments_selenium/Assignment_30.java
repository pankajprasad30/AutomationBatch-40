//Launch flipkart applicatio, hover over fashion and click mens-tshirt
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_30 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ho=driver.findElement(By.className("_1XjE3T"));
		Actions a1=new Actions(driver);
		a1.moveToElement(ho);
		

	}

}
