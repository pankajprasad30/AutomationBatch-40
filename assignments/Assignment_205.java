//Write a program for Case6 Annotation
package assignment_maven;

import org.testng.annotations.*;


public class Assignment_205 
{
	@AfterMethod
	void add4()
	{
		System.out.println("O/P from AM");
	}
	@BeforeMethod
	void add()
	{
		System.out.println("O/P from BM");
	}
	@Test
	void add1()
	{
		System.out.println("Test case 1");
	}
	@Test
	void add2()
	{
		System.out.println("Test case 2");
	}
	@Test
	void add3()
	{
		System.out.println("Test case 3");
	}


}

