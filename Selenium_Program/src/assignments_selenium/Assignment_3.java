//Program to Launch the google application, open, display title of the page and close the application
package assignments_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.close();

	}

}
