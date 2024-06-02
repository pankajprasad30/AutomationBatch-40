package selenium_Special_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(w1);
		//s1.selectByIndex(9);// here counts starts from 0
		
		//s1.selectByVisibleText("Amazon Pharmacy");
		
		s1.selectByValue("search-alias=mobile-apps");

	}

}
