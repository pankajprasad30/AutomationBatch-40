package selenium.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_1 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Pankaj Prasad\\eclipse-workspace\\Selenium_Program\\ExcelSheet");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

}
