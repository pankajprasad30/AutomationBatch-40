package cross_KT;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

}
