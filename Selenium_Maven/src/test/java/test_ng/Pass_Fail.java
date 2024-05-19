package test_ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pass_Fail 
{
	@Test
	public void pass()
	{
		Assert.assertEquals(true,false);
	}
	@Test(dependsOnMethods= "pass")
	public void fail()
	{
		Assert.assertEquals(true, false);
	}

}
