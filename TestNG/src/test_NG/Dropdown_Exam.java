package test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Exam {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/dropdown/");
		
		WebElement dd1=driver.findElement(By.id("Choice1"));
		Select s1=new Select(dd1);
		s1.selectByVisibleText("Demo2");

	}

}
