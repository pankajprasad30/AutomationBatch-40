//Log in into FB account
package assignments_AB40;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();// maximise browser
		driver.get("https://www.facebook.com/");// navigate to URL
		driver.findElement(By.id("email")).sendKeys("Pankajprasad30@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Automation@1234");
		driver.findElement(By.name("login")).click();

	}

}
