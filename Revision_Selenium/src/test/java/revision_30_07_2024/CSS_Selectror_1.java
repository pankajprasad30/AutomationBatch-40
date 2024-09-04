package revision_30_07_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectror_1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("pankaj@gmail.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("pankaj@gmail.com");

	}

}
