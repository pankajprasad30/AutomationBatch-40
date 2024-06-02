package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Selenium_Assert {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("India");
		w1.sendKeys(Keys.ENTER);
		
		Assertion hardAssert = new Assertion();
		hardAssert.assertEquals(driver.getTitle(), "India - Google Search");
		
		//Assertion SoftAssert = new SoftAssert();
		//SoftAssert.assertEquals(driver.getTitle(), "pndia - Google Search");
		

	}

}
