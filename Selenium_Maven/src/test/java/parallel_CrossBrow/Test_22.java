package parallel_CrossBrow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_22 
{
	WebDriver driver;
	@Test
	public void method_8() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone 15 pro");
		searchbox.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("a-autoid-3-announce")).click();
		WebElement w1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
		String s1=w1.getText().replace(",", "");
		double firstproduct= Double.parseDouble(s1);// ???????
		System.out.println(s1);
		System.out.println(firstproduct);
		
		driver.findElement(By.id("a-autoid-5-announce")).click();
		WebElement w2=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]"));
		String s2=w2.getText().replace(",", "");
		double secondproduct= Double.parseDouble(s2);
		System.out.println(s2);
		System.out.println(secondproduct);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		WebElement finalprice=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]"));
		String fin=finalprice.getText().substring(2, 10).replace(",", "");
		double finint= Double.parseDouble(fin);
		
		System.out.println(finint);
		double fullamount=(firstproduct+secondproduct);
		System.out.println(fullamount);
		Assert.assertEquals(fullamount, finint,"pass");
		
	}
	

}
