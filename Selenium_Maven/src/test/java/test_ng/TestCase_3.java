package test_ng;

import org.testng.annotations.Test;

public class TestCase_3 
{
	@Test (invocationCount=5)// Camel case
	void add()
	{
		System.out.println("Pankaj");
	}
	@Test (enabled=true)// Camel case
	void sub()
	{
		System.out.println("Pankaj");
	}
	
}
