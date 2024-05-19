package crossBrowser;

import org.testng.annotations.Test;

public class Test_4 
{
	@Test(groups= {"smoke"})
	public void add1()
	{
		System.out.println("Addtion 1");
	}
	@Test
	public void add2()
	{
		System.out.println("Addtion 2");
	}

	@Test(groups= {"system"})
	public void add3()
	{
		System.out.println("Addtion 3");
	}

	@Test(groups= {"smoke","system"})
	public void add4()
	{
		System.out.println("Addtion 4");
	}

	@Test(groups= {"smoke"})
	public void add5()
	{
		System.out.println("Addtion 5");
	}


}
