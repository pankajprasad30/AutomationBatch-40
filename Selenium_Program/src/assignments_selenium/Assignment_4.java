//Program to Launch the google chrome, open Flipkart application,display title of the page and close the Flipkart application
package assignments_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.close();

	}

}
