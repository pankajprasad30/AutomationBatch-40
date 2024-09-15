package selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		String browserID=driver.getWindowHandle();
		System.out.println(browserID);
		String Title=driver.getTitle();
		System.out.println(Title);
		//driver.quit();
		//driver.close();

	}

}