package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filebin.net/");
		WebElement upload= driver.findElement(By.xpath("//input[@id='fileField']"));
		upload.sendKeys("D:\\Java-Selenium Tools\\PDF sample\\file-sample_150kB.pdf");

	}

}
