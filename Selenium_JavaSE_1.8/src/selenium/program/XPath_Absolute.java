//Absolute X Path
package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Absolute {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("PankajPrasad70");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Practice");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("HelloJava123");
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("Pankaj");
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]")).sendKeys("Prasad");
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]")).click();
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		driver.findElement(By.xpath("(/html/body/a)[1]")).click();
		
		}

}
