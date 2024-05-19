package selenium.program;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		Thread.sleep(500);
		Date d1=new Date();
		//Date d2=new Date(d1.getTime()-(10*24*60*60*1000));
		
		TakesScreenshot t1=      (TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Pankaj Prasad\\Desktop\\Selenium Screenshot\\"+ new Screenshot_1().getClass()+d1.getTime()+".jpeg");
		FileHandler.copy(source, destination);
		

	}

}
