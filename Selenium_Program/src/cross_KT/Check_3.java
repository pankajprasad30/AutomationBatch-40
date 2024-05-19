package cross_KT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_3 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();
		driver.get("file:///D:/Java-Selenium%20Tools/Selenium_File/learningHTML1.html");
		WebElement w1=driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		w1.click();
		Thread.sleep(500);
		boolean b1=w1.isSelected();
		if (b1==true)
		{
			System.out.println("Componet is Selected");
		}
		else
		{
			System.out.println("Componet is not Selcted");
			
		}

	}

}
