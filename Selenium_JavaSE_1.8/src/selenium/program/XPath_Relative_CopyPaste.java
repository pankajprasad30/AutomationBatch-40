
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Relative_CopyPaste {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pankaj4798@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
		

	}

}
