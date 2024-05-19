//Write a program for Case2 Annotation
package assignment_maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_201 
{
	public static class TestNG_Annotations 
	{
		@BeforeSuite
		static void Apple()
		{
			System.out.println("BeforeSuite");
		}
		@BeforeTest
		static void Ball()
		{
			System.out.println("BeforeTest");
		}
		@BeforeClass
		static void cat()
		{
			System.out.println("BeforeClass");
		}
		@BeforeMethod
		static void mohan()
		{
			System.out.println("BeforeMethod");
		}
		
		@AfterMethod
		static void elephant()
		{
			System.out.println("AfterMethod");
		}
		@AfterClass
		static void fan()
		{
			System.out.println("AfterClass");
		}
		@AfterTest
		static void green()
		{
			System.out.println("AfterTest");
		}
		@AfterSuite
		static void india()
		{
			System.out.println("AfterSuite");
		}

	}

}
