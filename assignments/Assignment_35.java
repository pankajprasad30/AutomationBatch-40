//Navigate to amazon and Select books from Dropdown, using keys functionality using For Loop.
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_35 {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement DD=driver.findElement(By.id("searchDropdownBox"));
		DD.click();
		for(int i=0;i<=11;i++)
		{
			DD.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
		}
		DD.sendKeys(Keys.ENTER);
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("world war");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		
	}

}
