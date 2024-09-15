package testNG_Revision;

import org.testng.annotations.Test;

public class Grouping_TestNG 
{
	@Test(groups= {"smoke","Regression"})
	public void add()
	{
		System.out.println("Add_1");
		
	}
	@Test(groups= {"smoke"})
	public void add1()
	{
		System.out.println("Add_2");
		
	}
	@Test(groups= {"System"})
	public void add2()
	{
		System.out.println("Add_3");
		
	}
	@Test(groups= {"smoke","Regression","System"})
	public void add3()
	{
		System.out.println("Add_4");
		
	}

}
