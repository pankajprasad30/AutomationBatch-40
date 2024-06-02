package selenium.program;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_To_Cart {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement w1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("pankajprasad4798@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Automation@123");
		driver.findElement(By.id("signInSubmit")).click();
		
		WebElement w2=driver.findElement(By.id("twotabsearchtextbox"));
		w2.sendKeys("Shoes");
		w2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
		
		Set<String> browser_id=driver.getWindowHandles();
		Iterator<String> i1=browser_id.iterator();
		String parent_browser_id=i1.next();
		String child_browser_id=i1.next();
		System.out.println(parent_browser_id);
		System.out.println(child_browser_id);
		driver.switchTo().window(child_browser_id);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")).click();
		WebElement e1=		driver.findElement(By.name("ApxSecureIframe"));
		driver.switchTo().frame(e1);
		driver.findElement(By.name("addCreditCardNumber")).sendKeys("12345678");
		
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//input[@id='pp-JFQANQ-16']")).sendKeys("123243234321");

	}

}
