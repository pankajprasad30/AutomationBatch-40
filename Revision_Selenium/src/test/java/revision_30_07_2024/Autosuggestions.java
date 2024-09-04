package revision_30_07_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement w1=driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("chair");
		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int i1=l1.size();
		
		
		System.out.println(i1);
		//Thread.sleep(1000);
		l1.get(i1-8).click();

	}

}
