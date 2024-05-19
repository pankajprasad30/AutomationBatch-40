




package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Relative_Amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("Java Book");
		driver.findElement(By.xpath("(//input)[6]")).click();
	}

}
