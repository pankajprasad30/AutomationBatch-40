//ScrollDown infinete time by giving y axis values as 200
package assignment_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_228 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		WebElement w1=driver.findElement(By.linkText("Amazon Global Selling"));
		Point p1=w1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		Thread.sleep(3000);
		JavascriptExecutor js1= (JavascriptExecutor) driver;
		for(int i=1;i<2;i--)
		{
			js1.executeScript("window.scrollBy(0,200)");
		}

		
	}
	
	

}
