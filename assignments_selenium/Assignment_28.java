//Launch Amazon and need to select the Books not from select class but from the keys functionality arrow down
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_28 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));
		w1.click();
		Thread.sleep(200);
		for (int i=0;i<12;i++)
		{
			w1.sendKeys(Keys.ARROW_DOWN);
		}

	}

}
