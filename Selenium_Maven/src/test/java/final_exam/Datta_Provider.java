package final_exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datta_Provider 
{
	WebDriver driver;
	@DataProvider(name="data1")
	public Object[][] method() throws InterruptedException
	{
		Thread.sleep(3000);
		return new Object[][] {{"Salman Khan"},{"Amir Khan"},{"Sarukh Khan"}};
		
	}

	@Test (dataProvider="data1")
	public void people_search(String name) throws InterruptedException
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.youtube.com/");
		WebElement search=driver.findElement(By.xpath("(//input[@id='search'])[1]"));
		Thread.sleep(3000);
		//search.sendKeys("Salman khan");
		//.sendKeys(Keys.ENTER);
		//search.sendKeys(name+Keys.ENTER);
		search.sendKeys(name);
		search.sendKeys(Keys.ENTER);
	}
	

}
