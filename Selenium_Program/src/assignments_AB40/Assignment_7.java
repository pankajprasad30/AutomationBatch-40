//Launch amazon.in,click on customer service, click on order,login into application
package assignments_AB40;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.className("ss-v2-box-image")).click();
		driver.findElement(By.id("ap_email")).sendKeys("pankajprasad4798@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Automation@123");
		driver.findElement(By.id("signInSubmit")).click();

	}

}
