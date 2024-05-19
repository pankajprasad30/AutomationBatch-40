//Launch Chrome browser with basic functions like get,close,quit & get title.
package assignments_AB40;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// Launch empty browser
		driver.manage().window().maximize();// maximise browser
		driver.get("https://www.google.com/");// navigate to URL
		System.out.println(driver.getTitle());// For printing title in console
		//driver.close();// close browser which has control or closing parent browser
		driver.quit();//quit method is use to close all the tab open in browser

	}

}
