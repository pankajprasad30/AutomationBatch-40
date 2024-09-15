package testNG_Revision;

import org.testng.annotations.Test;

public class Annotation_Parameters {

	@Test(priority=1)
	public void add()
	{
		System.out.println("Pankaj1");
	}
	@Test
	public void add2()
	{
		System.out.println("Pankaj2");
	}
	@Test(priority=-3)
	public void add3()
	{
		System.out.println("Pankaj3");
	}
	@Test (invocationCount=5)
	public void add4()
	{
		System.out.println("Pankaj4");
	}
	@Test(enabled=true)
	public void add5()
	{
		System.out.println("Pankaj5");
	}
	@Test(timeOut=1000)
	public void add6()
	{
		System.out.println("Pankaj6");
	}

}
