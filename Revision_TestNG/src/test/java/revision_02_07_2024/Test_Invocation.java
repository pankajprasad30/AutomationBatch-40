package revision_02_07_2024;

import org.testng.annotations.Test;

public class Test_Invocation 
{
	@Test(invocationCount=2)
	public static void method()
	{
		System.out.println("Method");
	}

}
