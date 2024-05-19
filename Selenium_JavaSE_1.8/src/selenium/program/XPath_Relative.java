package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Relative {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("PankajPrasad20");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("School Name");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("K.V.Chabua");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Pankaj");
		//driver.findElement(By.xpath("(//input)[5]")).sendKeys("Prasad"); Field Disabled
		//driver.findElement(By.xpath("(//input)[6]")).sendKeys("PankajPrasad20"); Submit Button, ignore as of now
		driver.findElement(By.xpath("(//input)[7]")).click();
		driver.findElement(By.xpath("(//input)[8]")).click();
		driver.findElement(By.xpath("(//input)[9]")).click();
		//driver.findElement(By.xpath("(//input)[10]")).click(); Ignore
		driver.findElement(By.xpath("(//input)[11]")).click();
		driver.findElement(By.xpath("(//input)[12]")).click();
		driver.findElement(By.xpath("(//input)[13]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a)[1]")).click(); //Below method can be used if tag name is unique.
		//driver.findElement(By.tagName("a")).click();

	}

}
