//Program to Launch the Microsoft Edge, open the Flipkart application, display title of the page and close the application 
package assignments_selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_5 {

	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.close();


	}

}
