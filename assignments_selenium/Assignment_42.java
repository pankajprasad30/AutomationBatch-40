//Automate SBI New User registration page ( https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm )
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_42 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
		driver.navigate().refresh();
		Thread.sleep(500);
		driver.findElement(By.id("accountNo")).sendKeys("32123123");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();

	}

}
