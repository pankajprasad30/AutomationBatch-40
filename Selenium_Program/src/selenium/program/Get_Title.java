package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {

	public static void main(String[] args) 
	{
		ChromeDriver c1= new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.google.com");
		String t1=c1.getTitle();
		System.out.println(t1);

	}

}
