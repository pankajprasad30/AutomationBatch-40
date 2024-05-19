package selenium.program;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Cart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
		Set<String> browser_id=driver.getWindowHandles();
		Iterator<String> a1=browser_id.iterator();
		String Parent=a1.next();
		String prnt_chld=a1.next();
		driver.switchTo().window(prnt_chld);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		WebElement click1=driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]"));
		click1.click();
		WebElement name=driver.findElement(By.id("ap_email"));
		name.sendKeys("pankajprasad4798@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Automation@123");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("pmts-instrument-selector")).click();
		driver.findElement(By.className("a-row pmts-add-cc-default-trigger")).click();
		//driver.findElement(By.xpath("//a[@id='pp-DJJjZZ-100']")).click();//this line is not working
		driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")).click();		
		

	}

}