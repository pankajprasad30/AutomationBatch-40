//Program to Launch the Internet Explore browser, open the Amazon application, display title of the page and close the application
package assignments_selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment_6 {

	public static void main(String[] args) 
	{
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://www.amazon.in/");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.close();


	}

}
