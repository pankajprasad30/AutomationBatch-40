package cross_KT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement w1=driver.findElement(By.name("q"));
		w1.sendKeys("mouse");
		Thread.sleep(500);
		/*List<WebElement> w2=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		//System.out.println(w2.size());
		//w2.get(w2.size()-6).click();
		int count_Auto=w2.size();
		System.out.println(count_Auto);
		w2.get(w2.size()-6).click();
		w2.get(w2.size()-6).click();*/
		WebElement w3=driver.findElement(By.xpath("(//form[@class='_2rslOn header-form-search OpXDaO']/ul/li)[2]"));
		w3.click();// direct method
		
		

	}

}