package revision_15_07_2024;

public class Try_Cath_1 {

	public static void main(String[] args) 
	{
		try
		{
		int a=10;
		int b=a/0;
		System.out.println(b);
		}
		catch(ArithmeticException x)
		{
			System.out.println("Exception Handled");
		}
		finally 
		{
			System.out.println("Handled by pankaj");
		}

	}

}
