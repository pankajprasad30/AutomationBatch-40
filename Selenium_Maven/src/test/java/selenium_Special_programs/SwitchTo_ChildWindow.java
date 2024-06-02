package selenium_Special_programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ChildWindow {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement w1=driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("shoe");
		w1.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
		
		Set<String> browser_id=driver.getWindowHandles();
		Iterator<String> i1=browser_id.iterator();
		String parent_id=i1.next();
		String child_id=i1.next();
		
		System.out.println(parent_id);
		System.out.println(child_id);
		driver.switchTo().window(child_id);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		

	}

}
