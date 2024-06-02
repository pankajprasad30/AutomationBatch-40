package test_NG;

import org.testng.annotations.*;

public class Annotation_TestNG 
{
	@Test// act as main method
	public static void Aloo()
	{
		System.out.println("Aloooooo");
	}
	@BeforeSuite
	public static void BS()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public static void BT()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public static void BC()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public static void BM()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public static void Bhallo()
	{
		System.out.println("Bhallooooo");
	}
	@AfterMethod
	public static void AM()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public static void AC()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public static void AT()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public static void AS()
	{
		System.out.println("AfterSuite");
	}

}
