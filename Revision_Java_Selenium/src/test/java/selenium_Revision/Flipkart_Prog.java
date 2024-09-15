package selenium_Revision;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Prog {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("Mobile"+Keys.ENTER );
		
		List<WebElement> mobiles=driver.findElements(By.xpath("//div[@class='tUxRFH']"));
		System.out.println(mobiles.size());
		int mobile_Selection=mobiles.size();
		mobiles.get(mobile_Selection-22).click();
		
		Set<String> browser_ID=driver.getWindowHandles();
		Iterator<String> i1=browser_ID.iterator();
		String parent_BrowserID=i1.next();
		String Child_BrowserID=i1.next();
		driver.switchTo().window(Child_BrowserID);
		
		
		System.out.println(Child_BrowserID);
		System.out.println(parent_BrowserID);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();

	}

}
