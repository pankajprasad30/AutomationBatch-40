package parallel_CrossBrow;

import org.testng.annotations.Test;

class class_1
{
	@Test
	public void login_1()
	{
		System.out.println("Pankaj_1");
		
	}
	
}
class class_2 extends class_1
{
	@Test
	public void login_2()
	{
		System.out.println("Pankaj_2");
		
	}
	
}
class class_3 extends class_2
{
	@Test
	public void login_3()
	{
		System.out.println("Pankaj_3");
		
	}
	
}
class class_4 extends class_3
{
	@Test
	public void login_4()
	{
		System.out.println("Pankaj_4");
		
	}
	
}
class class_5 extends class_4
{
	@Test
	public void login_5()
	{
		System.out.println("Pankaj_5");
		
	}
	
}

public class Para_Cross extends class_5
{
	@Test
	public void login_Child()
	{
		System.out.println("Pankaj_Child");
		
	}
	
	

}
