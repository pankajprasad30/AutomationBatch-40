//Program to launch Amazon India from cat dropdown select the books, type world war and click on search button
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_21 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(dropdown);// remember this for dropdown
		s1.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Worl War");
		driver.findElement(By.id("nav-search-submit-button")).click();


	}

}
