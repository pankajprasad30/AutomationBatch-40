package testNG_Revision;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider 
{
	@Test(dataProvider="data2")
	public void YouTube(String a)
	{
		System.out.println(a+"Pankaj");
	}
	@DataProvider(name="data2")
	public Object[][] data_Youtube()
	{
		return new Object[][] {{"Ram"},{"Sita"},{"Laxman"}};
		
	}

}
