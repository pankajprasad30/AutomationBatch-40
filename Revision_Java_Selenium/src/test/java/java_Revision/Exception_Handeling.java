package java_Revision;

public class Exception_Handeling {

	public static void main(String[] args) 
	{
		try
		{
		int a=1;
		System.out.println(a/0);
		}
		catch (ArithmeticException a1)
		{
			System.out.println("undefined value can not be stored in int data type");
		}
		finally
		{
			System.out.println("Hello i will always be execute");
		}

	}

}
