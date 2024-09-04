package revision_30_07_2024;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		String Browser_ID=driver.getWindowHandle();
		String Page_Title=driver.getTitle();
		
		System.out.println(Browser_ID);
		System.out.println(Page_Title);
		//Set<String> id=driver.getWindowHandles();

	}

}
