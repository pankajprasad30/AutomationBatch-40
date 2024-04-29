// Automate me dropdown from grotechminds website.
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_DropDown {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		
		WebElement dd1=driver.findElement(By.id("Choice1"));
		Select s1=new Select(dd1);
		s1.selectByVisibleText("Demo2");
		
		WebElement dd2=driver.findElement(By.id("Choice2"));
		Select s2=new Select(dd2);
		s2.selectByValue("practice2");
		
		WebElement dd3=driver.findElement(By.id("Choice3"));
		Select s3=new Select(dd3);
		s3.selectByIndex(4);
		
		WebElement dd4=driver.findElement(By.id("Choice4"));
		Select s4=new Select(dd4);
		s4.selectByVisibleText("Energy7");
		
		WebElement dd5=driver.findElement(By.id("Choice5"));
		Select s5=new Select(dd5);
		s5.selectByVisibleText("Day3");
		
		WebElement dd6=driver.findElement(By.id("Choice6"));
		Select s6=new Select(dd6);
		s6.selectByVisibleText("Night10");
		
		WebElement dd7=driver.findElement(By.id("Choice7"));
		Select s7=new Select(dd7);
		s7.selectByVisibleText("Night4");
		
		WebElement dd8=driver.findElement(By.id("Choice8"));
		Select s8=new Select(dd8);
		s8.selectByVisibleText("QTP11");
		
		WebElement dd9=driver.findElement(By.id("Choice9"));
		Select s9=new Select(dd9);
		s9.selectByVisibleText("SQL13");
		
		WebElement dd10=driver.findElement(By.id("Choice10"));
		Select s10=new Select(dd10);
		s10.selectByVisibleText("CoreJava15");

	}

}
