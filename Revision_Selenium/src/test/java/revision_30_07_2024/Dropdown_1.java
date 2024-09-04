package revision_30_07_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement w1=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(w1);
		s1.selectByIndex(10);
		Thread.sleep(3000);
		s1.selectByValue("search-alias=amazon-pharmacy");
		Thread.sleep(3000);
		s1.selectByVisibleText("Video Games");

	}

}
