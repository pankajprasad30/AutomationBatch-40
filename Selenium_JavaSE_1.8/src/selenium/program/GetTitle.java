package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://flipkart.com");
		System.out.println(a1.getTitle());

	}

}
