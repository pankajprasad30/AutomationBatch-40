package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Amazon_AddtoCart_2Device 
{
	@Test
	public void Amazon_Cart() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("macbook");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@id='a-autoid-2-announce']")).click();
		WebElement macbook_pro=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
		String Price_1=macbook_pro.getText().replace(",", "");
		double Laptop_1=Double.parseDouble(Price_1);// 1st method to convert from string to int
		System.out.println(Laptop_1);
		
		driver.findElement(By.id("a-autoid-1-announce")).click();
		WebElement macbook_air=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String Price_2=macbook_air.getText().replaceAll(",", "");
		double Laptop_2=Double.valueOf(Price_2);// 2nd method
		System.out.println(Laptop_2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@id='nav-cart-count'])[1]")).click();
		
		double final_price=(Laptop_1+Laptop_2);
		System.out.println(final_price);
		
		WebElement Cart=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']"));
		String Cart_price=Cart.getText().replaceAll(",", "");
		double Cart_FinalPrice=Double.parseDouble(Cart_price);
		System.out.println(Cart_FinalPrice);
		
	   Assert.assertEquals(final_price, Cart_FinalPrice, "Fail");
	}

}
