package selenium_Revision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		
		List<WebElement> Auto_Sugesst=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count_Auto=Auto_Sugesst.size();
		System.out.println(count_Auto);
		
		Auto_Sugesst.get(count_Auto-3).click();
		
		

	}

}
