package test_NG;

import org.testng.annotations.Test;

public class Annotations_Priority 
{
	@Test
	public static void Aloo()
	{
		System.out.println("Aloooooo");
	}
	@Test(priority=2)
	public static void Aloo1()
	{
		System.out.println("Aloooooo1");
	}
	@Test(priority=-1000)
	public static void Aloo2()
	{
		System.out.println("Aloooooo2");
	}
	@Test(priority=200)
	public static void Aloo3()
	{
		System.out.println("Aloooooo3");
	}
	@Test(priority=-2)
	public static void Aloo4()
	{
		System.out.println("Aloooooo4");
	}
	

}
