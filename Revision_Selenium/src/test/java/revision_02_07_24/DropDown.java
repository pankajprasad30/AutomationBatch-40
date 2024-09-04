package revision_02_07_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(dd);
		//s1.selectByIndex(14);
		//s1.selectByVisibleText("Furniture");
		s1.selectByValue("search-alias=jewelry");

	}

}
