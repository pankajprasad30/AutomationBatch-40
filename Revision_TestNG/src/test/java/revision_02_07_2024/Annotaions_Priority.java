package revision_02_07_2024;

import org.testng.annotations.Test;

public class Annotaions_Priority 
{
	@Test(priority=20)
	public void B_1()
	{
		System.out.println("B_1");
	}

	
		@Test(priority=-1)
		public void method_1()
		{
			System.out.println("Method_1");
		}
		@Test
		public void A_1()
		{
			System.out.println("A_1");
		}

	

}
