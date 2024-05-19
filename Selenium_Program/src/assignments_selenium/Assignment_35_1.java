//Launch amazon from drop down select books and type world war.
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_35_1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search_dd=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(search_dd);
		s1.selectByVisibleText("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("World War");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
