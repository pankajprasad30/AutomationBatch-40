//"Add 2 product to cart and compare its total price with assertion.

//Before adding any product to cart->gettext price"
package assignment_maven;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_219 
{
	@Test
	public void Amazon_Cart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in/");
		WebElement HoverOver=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);// HoverOver
		a1.moveToElement(HoverOver).perform();
		WebElement signin=driver.findElement(By.className("nav-action-inner"));
		signin.click();
		WebElement username=driver.findElement(By.id("ap_email"));
		username.sendKeys("pankajprasad4798@gmail.com");
		username.sendKeys(Keys.ENTER);
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("Automation@123");
		password.sendKeys(Keys.ENTER);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes");
		Thread.sleep(1000);
		
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));// Auto suggestion
		int count=autosuggestion.size();
		autosuggestion.get(count-6).click();
		
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]")).click();
		WebElement Shoe_1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String Shoe_PriceString=Shoe_1.getText();
		double Shoe_1Price=Double.parseDouble(Shoe_PriceString);
		System.out.println(Shoe_1Price);
		
		Set<String> browser_id=driver.getWindowHandles();// to move control from parent to child
		Iterator<String> b1=browser_id.iterator();
		String parent_ID=b1.next();
		String child_ID=b1.next();
		//String Child_ID_2=b1.next();
		
		System.out.println("Parent Browser ID : "+parent_ID);
		System.out.println("Child Browser ID : "+child_ID);
		
		driver.switchTo().window(child_ID);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.switchTo().window(parent_ID);// control moved to parent window
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[8]")).click();// perfect
		
		
		
		//System.out.println(Child_ID_2);
		
		/*Iterator<String> b2=browser_id.iterator();
		String p=b2.next();
		String c=b2.next();
		System.out.println(p);
		System.out.println(c);
		
		
		
		
		
		
		
		
		/*Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("proceed-to-checkout-action")).click();
		
		
		/Set<String> browser_id1=driver.getWindowHandles();
		Iterator<String> b3=browser_id.iterator();
		String parent_ID_1=b3.next();
		String Child_ID_1=b3.next();
		System.out.println(Child_ID_1);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
