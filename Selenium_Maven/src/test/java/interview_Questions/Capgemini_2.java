package interview_Questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capgemini_2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com/");
		String s1=driver.getTitle();
		System.out.println(s1);
		

	}

}
