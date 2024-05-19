package selenium.program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("Pankaj");
		Thread.sleep(1000);
		TakesScreenshot t1=     driver;
		File Source=t1.getScreenshotAs(OutputType.FILE);
        File Destination=new File("C:\\Users\\Pankaj Prasad\\Desktop\\Selenium Screenshot\\2.jpeg");
        FileHandler.copy(Source, Destination);
	}

}
