//Launch Naukri.com click on Register and After that click on continue with Google
package assignments_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_14 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIs9qg1-bjhQMVxY1LBR15-QU4EAAYASAAEgIqKvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.className("socialIcnImg")).click();

	}

}
