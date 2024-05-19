//Launch naukri.com and click on sign in with google
package assignments_AB40;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();// maximise browser
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");// navigate to URL
		driver.findElement(By.linkText("Sign in with Google")).click();

	}

}
