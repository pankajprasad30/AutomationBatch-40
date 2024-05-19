//Write an Absolute xpath and relative xpath for the html file(shared my Manish) for all the fields
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_31_Absolute {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		//Absolute X-Path
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("pankajprasad30");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Name");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Automation@123");
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("Pankaj");
		//driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]")).sendKeys("Prasad"); since field is disable so its not working
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		WebElement d_d=driver.findElement(By.id("Relegion"));
		Select s1=new Select(d_d);
		s1.selectByVisibleText("Hindu");
		
		

	}

}
