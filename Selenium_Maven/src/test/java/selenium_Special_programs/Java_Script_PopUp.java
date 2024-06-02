package selenium_Special_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_PopUp {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		
		driver.switchTo().alert().accept();

	}

}
