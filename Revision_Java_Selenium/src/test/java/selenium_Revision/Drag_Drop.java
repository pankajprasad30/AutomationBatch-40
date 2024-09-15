package selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(".........");
		WebElement drag=driver.findElement(By.xpath(".........."));
		WebElement drop=driver.findElement(By.xpath(".........."));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();

	}

}
