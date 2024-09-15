package selenium_Revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Over {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		
		WebElement HoverOver=driver.findElement(By.xpath("//div[@class=\"H6-NpN _3N4_BX\"]"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(HoverOver).perform();

	}

}
