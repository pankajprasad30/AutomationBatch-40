//get window handle and handles
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://google.com");
		System.out.println(a1.getWindowHandle());
		System.out.println(a1.getWindowHandles());

	}

}
