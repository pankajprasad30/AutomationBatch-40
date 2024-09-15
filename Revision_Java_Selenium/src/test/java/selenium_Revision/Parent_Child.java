package selenium_Revision;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes"+Keys.ENTER);
		WebElement shoe_click=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		shoe_click.click();
		
		Set<String>browser_ID=driver.getWindowHandles();
		System.out.println(browser_ID);
		Iterator<String> i1=browser_ID.iterator();
		String Parent_ID=i1.next();
		String Child_ID=i1.next();
		
		System.out.println(Parent_ID);
		System.out.println(Child_ID);
		driver.switchTo().window(Child_ID);
		driver.findElement(By.id("add-to-cart-button")).click();
		

	}

}