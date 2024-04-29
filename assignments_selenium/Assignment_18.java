//Program to Launch the amazon, click the search the Category Dropdown and select the Amazon Devices using select by value.
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_18 {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(dropdown);// remember this for dropdown
		s1.selectByValue("search-alias=amazon-devices");
	}

}
