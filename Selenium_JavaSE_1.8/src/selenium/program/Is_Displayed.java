package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement a1= driver.findElement(By.xpath("//input[@id='fname']"));
		//a1.sendKeys("Pankaj");
		boolean checking_firstname= a1.isDisplayed();
		
		if(checking_firstname==true)
		{
			a1.sendKeys("Pankaj");
		}
		else
		{
			System.out.println("Do Nothing");
			
		}
		

	}

}
