//Program to launch Amazon.in, click on Customer service, in that select Your Order
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_15 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[8]")).click();
		driver.findElement(By.xpath("(//h3[@class='a-spacing-none a-text-normal'])[1]")).click();

	}

}
