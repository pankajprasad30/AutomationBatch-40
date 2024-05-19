package test.POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import source.POM.Login;
import source.POM.Search;

public class TestCase1 
{
	@Test
	public void amazon_login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Hoverover
		/*WebElement a1=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions b1=new Actions(driver);
		b1.moveToElement(a1).perform();
		driver.findElement(By.linkText("Sign in")).click();*/
		
		Login l1= new Login(driver);
		l1.un();
		l1.cont();
		l1.pswd();
		l1.signin();

		Search s1=new Search (driver);
		s1.search_shoe();
		
		
		
		
		
		
	}

}
