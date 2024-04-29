//Program to Launch the Mozilla Firefox browser, open the application, display title of the page and close the application
package assignments_selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_8 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.close();

	}

}
