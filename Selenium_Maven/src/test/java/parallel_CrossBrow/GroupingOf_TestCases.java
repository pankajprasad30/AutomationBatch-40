package parallel_CrossBrow;

import org.testng.annotations.Test;

public class GroupingOf_TestCases 
{
	@Test(groups= {"Smoke","System","Integration"})
	public void testcase_1()
	{
		System.out.println("testcase_1");
	}
	@Test(groups= {"Smoke","System"})
	public void testcase_2()
	{
		System.out.println("testcase_2");
	}
	@Test
	public void testcase_3()
	{
		System.out.println("testcase_3");
	}
	@Test(groups= {"Integration"})
	public void testcase_4()
	{
		System.out.println("testcase_4");
	}

}
