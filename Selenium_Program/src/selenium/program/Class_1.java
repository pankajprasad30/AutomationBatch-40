package selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1 {

	public static void main(String[] args) 
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");

	}

}
