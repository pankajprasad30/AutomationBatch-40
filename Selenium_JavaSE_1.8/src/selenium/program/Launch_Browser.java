package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser {

	public static void main(String[] args) 
	{
		ChromeDriver a1=new ChromeDriver();
		a1.get("https://www.yahoo.com");
		
		FirefoxDriver b1=new FirefoxDriver();
		b1.get("https://www.apple.in");
		
		EdgeDriver c1=new EdgeDriver();
		c1.get("https://Honeywell.com");
		
	}

}
