package selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_LinkText {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.yahoo.com");
	    driver.findElement(By.partialLinkText("Sig")).click();
				

	}

}
