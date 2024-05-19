//Write a program for Case5 Annotation
package assignment_maven;

import org.testng.annotations.*;


public class Assignment_204 {
	@AfterSuite
	void add4()
	{
		System.out.println("O/P from AS");
	}
	@BeforeMethod
	void add()
	{
		System.out.println("O/P from BM");
	}
	@AfterClass
	void add1()
	{
		System.out.println("O/P from AC");
	}
	@Test
	void add2()
	{
		System.out.println("Test case 2");
	}

}
