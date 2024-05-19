//WAP to launch Google using get in selenium
package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://google.com");
	    Thread.sleep(2000);
		
		a1.close();
	}

}
