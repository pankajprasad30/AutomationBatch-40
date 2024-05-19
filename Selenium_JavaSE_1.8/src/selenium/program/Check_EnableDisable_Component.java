package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_EnableDisable_Component {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		WebElement a1= driver.findElement(By.xpath("//input[@id=121]"));
		boolean checking_lastname= a1.isEnabled();
				if (checking_lastname==true && a1.isDisplayed()==true )
				{
					
				}
				else
				{
					
				}

	}

}
