package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_AmazonHandle {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement a1= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions b1=new Actions(driver);
		b1.moveToElement(a1).perform();

	}

}
