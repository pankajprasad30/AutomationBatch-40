//Launch FB registration,FN,LN,Email ID, Password,DOB,Radio button
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_36_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Pankaj");
		driver.findElement(By.name("lastname")).sendKeys("Prasad");
		driver.findElement(By.name("reg_email__")).sendKeys("pankajprasad4798@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Automation@123");
		
		WebElement day=driver.findElement(By.id("day"));
		Select s1=new Select(day);
		s1.selectByValue("23");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Dec");
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1986");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_5_Lz")).click();//Check why radio button is not working
	}

}
