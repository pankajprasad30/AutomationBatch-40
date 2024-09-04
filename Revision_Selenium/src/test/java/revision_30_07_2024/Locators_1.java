package revision_30_07_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		//driver.findElement(By.id("ap_email")).sendKeys("Pankaj@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("pankaj@gmail.com");
		//driver.findElement(By.className("a-input-text a-span12 auth-autofocus auth-required-field auth-require-claim-validation")).sendKeys("pankaj@gmail.com");
		/*driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gma")).click();*/
		//driver.findElement(By.tagName("a")).click();
		
		//x-path 1. relative starts //
		//driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("India");
		
		//absolute
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div/div/div[2]/textarea")).sendKeys("India");
		

	}

}
