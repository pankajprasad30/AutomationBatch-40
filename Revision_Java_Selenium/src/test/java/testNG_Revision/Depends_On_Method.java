package testNG_Revision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_On_Method 
{
	@Test
	public void add()
	{
		Assert.assertTrue(false);
		//System.out.println("Pankaj");
	}
	@Test(dependsOnMethods="add")
	public void multiply()
	{
		System.out.println("Darshika");
	}

	
}
