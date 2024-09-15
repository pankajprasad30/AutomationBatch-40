package testNG_Revision;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Data_Sending_Other_way 
{

	@Test
	public void google()
	{
//		ArrayList<String> data=new ArrayList<String>();
//		data.add("India");
//		data.add("Thailand");
//		
//		Map<String,String> mp2=new HashMap<String,String>();
//		mp2.put("India", "Deli");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		//driver.findElement(By.name("q")).sendKeys(data);
		
		
	}

}
