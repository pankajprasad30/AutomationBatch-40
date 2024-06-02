package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotations_Parameters 
{
	@Test(invocationCount=10)
	public static void Method_1()
	{
		System.out.println("Method_1");
	}
	@Test(priority=1)
	public static void Method_2()
	{
		System.out.println("Method_2");
	}
	@Test (enabled=false)
	public static void Method_3()
	{
		System.out.println("Method_3");
	}
	@Test(timeOut=2000)
	public static void Method_4()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
	}
	@Test(dependsOnMethods="Method_4")
	public static void Method_5()
	{
		System.out.println("Method_5");
	}

}
