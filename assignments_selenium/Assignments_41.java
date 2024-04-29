//Launch page( https://grotechminds.com/drag-and-drop/ ) and practice Drag And Drop.Try to do the 8 Questions mentioned in the page.
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignments_41 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		/*WebElement drag=driver.findElement(By.id("drag7"));
		WebElement drop=driver.findElement(By.id("div2"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		
	//1. Write a code to drag and drop JSON    
		WebElement drag1=driver.findElement(By.id("drag11"));
		WebElement drop1=driver.findElement(By.id("div2"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(drag1, drop1).perform();*/
		
	//2. Write a code to return GitHub to original position after drag and drop  
		WebElement drag2=driver.findElement(By.id("drag5"));//source
		WebElement drop2=driver.findElement(By.id("div2"));//target
		Actions a3=new Actions(driver);
		a3.dragAndDrop(drag2, drop2).perform();//source-->target
		Thread.sleep(2000);
		WebElement drag3=driver.findElement(By.id("div2"));
		WebElement drop3=driver.findElement(By.id("drag5"));
		Actions a4=new Actions(driver);
		a4.dragAndDrop(drop3, drag3).perform();
		
	}

}
