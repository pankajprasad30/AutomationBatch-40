package selenium.program;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handle {

	public static void main(String[] args) 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.manage().window().maximize();
		c1.get("https://www.google.com/");
		
		String a1=c1.getWindowHandle();//single browser ID
		System.out.println(a1);
		
		Set<String> b1=c1.getWindowHandles();// parent & child window browser ID
		System.out.println(b1);
		 //or 
		System.out.println(c1.getWindowHandle());
		System.out.println(c1.getWindowHandles());

	}

}
