package assignments_AB40;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_13_KotakBank {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.kotak.com/knb2/");
		WebElement a1=driver.findElement(By.id("userName"));
		Thread.sleep(1000);
		a1.sendKeys(Keys.F5);
		a1.sendKeys("Pankaj@123");
		

	}

}
