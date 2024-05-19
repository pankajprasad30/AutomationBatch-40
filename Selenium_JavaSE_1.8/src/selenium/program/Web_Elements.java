package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Elements {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement googlesearch=driver.findElement(By.name("q"));//google search text field
		googlesearch.sendKeys("India");
		googlesearch.sendKeys(Keys.ENTER);

	}

}
