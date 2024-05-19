//How to handle dropdown program,amazon.in
package assignments_AB40;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_8 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search_dd=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(search_dd);
		//s1.selectByIndex(2);
		//s1.selectByValue("search-alias=fashion");
		s1.selectByVisibleText("Books");
	}

}
