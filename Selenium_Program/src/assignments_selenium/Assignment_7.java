//Program to Launch the Safari browser, open the application, display title of the page and close the application
package assignments_selenium;

import org.openqa.selenium.safari.SafariDriver;

public class Assignment_7 {

	public static void main(String[] args) 
	{
		SafariDriver driver= new SafariDriver();
		driver.get("https://www.yahoo.com/");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.close();

	}

}
