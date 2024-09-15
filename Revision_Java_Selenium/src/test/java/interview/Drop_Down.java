package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dd=driver.findElement(By.id("searchDropdownBox"));
		
		
		
		Select s1=new Select(dd);
		s1.selectByIndex(3);
		List <WebElement> l1=s1.getOptions();
		int count=l1.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement text=l1.get(i);
			System.out.println(text.getText());
		}

		
//		dd.click();
//
//		List<WebElement> DropDown=driver.findElements(By.id("searchDropdownBox"));
//		System.out.println(DropDown.size());
		

	}

}
