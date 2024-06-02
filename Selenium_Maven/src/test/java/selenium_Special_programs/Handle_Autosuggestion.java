package selenium_Special_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Autosuggestion {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		
		//driver.findElement(By.xpath("(//div[@class='two-pane-results-container']/div/div)[3]")).click();//for direct click
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int auto_count=l1.size();// remember this there is size method after above line
		System.out.println(auto_count);
		l1.get((auto_count)-3).click();
		

	}

}
