//Write an Absolute xpath and relative xpath for the html file(shared my Manish) for all the fields
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_31_Relative {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		//Relative X-Path
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("pankajprasad30");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Name");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Pankaj@123");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Pankaj");
		//driver.findElement(By.xpath("(//input)[5]")).sendKeys("Prasad");
		driver.findElement(By.xpath("(//input)[8]")).click();
		driver.findElement(By.xpath("(//input)[11]")).click();
		driver.findElement(By.xpath("(//input)[13]")).click();
		WebElement d_d=driver.findElement(By.xpath("//select[@id='Relegion']"));
		Select s1=new Select(d_d);
		s1.selectByVisibleText("Hindu");

	}

}
