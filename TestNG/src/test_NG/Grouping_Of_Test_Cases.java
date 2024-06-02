package test_NG;

import org.testng.annotations.Test;

public class Grouping_Of_Test_Cases 
{
	@Test(groups= {"smoke","intergation","system","regrassion","sanity","unit_testing"})
	public void TestCase1()
	{
		System.out.println("TestCase1");
	}
	@Test(groups= {"smoke"})
	public void TestCase2()
	{
		System.out.println("TestCase2");
	}
	@Test(groups= {"smoke","system"})
	public void TestCase3()
	{
		System.out.println("TestCase3");
	}
	@Test(groups= {"regrassion"})
	public void TestCase4()
	{
		System.out.println("TestCase4");
	}

}
