package cross_KT;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Get {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.google.com/");
		//String s1=c1.getTitle();
		//System.out.println(s1);
		c1.findElement(By.id("APjFqb")).sendKeys("India is best country");
		
		//System.out.println(c1.getTitle());
		
		
		
		/*Thread.sleep(2000);
		c1.quit();//
		c1.close();*/

	}

}
