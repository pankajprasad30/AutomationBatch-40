package assignment_maven;

import org.testng.annotations.*;

public class Assignment_202 
{
	@BeforeSuite
	void test1()
	{
		System.out.println("op from BS");
		
	}
	@BeforeTest

	void test2()
	{
		System.out.println("op from BT");
		
	}
		
	
	@BeforeClass

	void test3()
	{
		System.out.println("op from BC");
		
	}
		
	
	@BeforeMethod

	void test4()
	{
		System.out.println("op from BM");
		
	}
		
		
	
	@Test

	void test5()
	{
		System.out.println("op from test");
	}
		
	

}
