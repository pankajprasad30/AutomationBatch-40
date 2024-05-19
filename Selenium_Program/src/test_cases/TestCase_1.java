/*
1. Launch Browser
2. navigate to xyz.com-- by using get method
3. validate title of web page
4. close browser
 */
package test_cases;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // for maximizing the browser
		driver.get("https://www.google.com/");// navigation to any URL
		String s1=driver.getTitle();// method to get title of web page
		System.out.println(driver.getTitle());// for title of the webpage
		
		if (s1.equals("Googlee"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		driver.close();
	}

}
