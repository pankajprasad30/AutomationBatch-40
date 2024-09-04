package revision_02_07_2024;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotaions 
{
	@Test
	public static void test_1()
	{
		System.out.println("@test_1");
	}
	@BeforeMethod
	void BM()
	{
		System.out.println("BM");
	}
	@AfterMethod
	void AM()
	{
		System.out.println("AM");
	}
	//STCM--> BeforeSuite-> BeforeTest-> BeforeClass-> BeforeMethod----> AfterSuite->AfterTest->AfterClass->AfterMethod

}
