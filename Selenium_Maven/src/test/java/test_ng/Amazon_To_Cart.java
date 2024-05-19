package test_ng;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_To_Cart 
{
	@Test
	public void amazon_22() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.amazon.in/");
	WebElement HoverOver=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a1=new Actions(driver);// HoverOver
	a1.moveToElement(HoverOver).perform();
	WebElement signin=driver.findElement(By.className("nav-action-inner"));
	signin.click();
	WebElement username=driver.findElement(By.id("ap_email"));
	username.sendKeys("pankajprasad4798@gmail.com");
	username.sendKeys(Keys.ENTER);
	WebElement password=driver.findElement(By.id("ap_password"));
	password.sendKeys("Automation@123");
	password.sendKeys(Keys.ENTER);
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]")).click();
	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")).click();
	
	Set<String> browser_id=driver.getWindowHandles();// to move control from parent to child
	Iterator<String> b1=browser_id.iterator();
	String parent_ID=b1.next();
	String child_ID_1=b1.next();
	String Child_ID_2=b1.next();
	System.out.println("Parent browser ID : "+parent_ID);
	System.out.println("Child browser ID 1 : "+child_ID_1);
	System.out.println("Child browser ID 2 : "+Child_ID_2);
	
	Thread.sleep(2000);
	
	driver.switchTo().window(child_ID_1);
	WebElement Shoe_1= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	String price=Shoe_1.getText().replaceAll(",", "");
	double Shoe_1_Price=Double.parseDouble(price);
	System.out.println(Shoe_1_Price);
	driver.findElement(By.id("add-to-cart-button")).click();
	
	driver.switchTo().window(Child_ID_2);
	WebElement Shoe_2= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	String price2=Shoe_2.getText().replaceAll(",", "");
	double Shoe_2_Price=Double.parseDouble(price2);
	System.out.println(Shoe_2_Price);
	driver.findElement(By.id("add-to-cart-button")).click();
	
	WebElement price5=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	String Price_6=price5.getText().replaceAll(",", "");
	double Expected_Price=Double.parseDouble(Price_6);
	System.out.println(Expected_Price);
	
	double Actual_Price= Shoe_1_Price+Shoe_2_Price;
	System.out.println(Actual_Price);
	
	Assert.assertEquals(Actual_Price, Expected_Price);
	
	
	
	
	
	
	
	
	}

}
