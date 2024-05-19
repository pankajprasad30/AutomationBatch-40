package test_ng;

import org.testng.annotations.*;

public class TestCase_6 
{
	@Test
	void pankaj()
	{
		System.out.println("pankaj");
	}
	@BeforeMethod
	void prasad()
	{
		System.out.println("prasad");
	}
	@AfterMethod
	void darshika()
	{
		System.out.println("darshika");
	}
	
	@Test
	void sum()
	{
		System.out.println("Sum");
	}

}
