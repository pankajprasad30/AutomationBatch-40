package selenium_Revision;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreeShot {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(dropdown);
		s1.selectByIndex(7);
		
		TakesScreenshot t1=(TakesScreenshot)driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Pankaj Prasad\\Desktop\\Selenium_Screenshot\\"+Math.random()+Get.class+".jpeg");
		FileHandler.copy(source, destination);

	}

}