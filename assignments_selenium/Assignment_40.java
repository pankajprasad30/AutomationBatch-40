//Handle Autosuggestion for Myntra application(search box)
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_40 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement search=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.sendKeys("Shoes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//li[@class='desktop-suggestion null'])[5]")).click();
		
		
		
		
		
		
		//Actions a1=Actions(driver);
		
		//Scanner s1=new Scanner(System.in);

	}

}
