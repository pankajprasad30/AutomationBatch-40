package selenium.program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ComponentSelect {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions r1=new Actions(driver);
		r1.contextClick(gmail).perform();
		
		Robot r11=new Robot();
		r11.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r11.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r11.keyPress(KeyEvent.VK_ENTER);
		

	}

}
