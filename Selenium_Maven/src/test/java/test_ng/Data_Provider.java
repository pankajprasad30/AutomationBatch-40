package test_ng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider 
{
	@Test (dataProvider="data1")
	public void method_1_Addition(int q)
	{
		System.out.println(q+100);
	}
	@DataProvider (name="data1")
	public Object[][]method1()
	{
		return new Object[][] {{100},{200},{300},{400}};	
	}
	
	
	
	@Test (dataProvider="data2")
	public void method_2_Addition(String emailID)
	{
		System.out.println(emailID.concat(" : is my email ID "));
	}
	@DataProvider (name="data2")
	public Object[][]method2()
	{
		return new Object[][] {{"pankaj@gmail.com"},{"neha@gmail.com"},{"prasad@gmail.com"},{"Darshika@gmail.com"}};	
	}
	
	

}
