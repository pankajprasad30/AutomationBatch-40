//Program to launch Facebook and do the Registration
package assignments_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_22 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Pankaj");
		driver.findElement(By.name("lastname")).sendKeys("Prasad");
		driver.findElement(By.name("reg_email__")).sendKeys("pankajprasad30@icloud.cod");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Auotame@54321");
		WebElement day=driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByVisibleText("23");
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Dec");
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1986");
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[.='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		


	}

}
