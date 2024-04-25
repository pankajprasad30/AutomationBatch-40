package exam_revesion;

public class Exception_handling 
{

	public static void main(String[] args) 
	{
		
		try
		{
			int a=0,b=1;
			int divide=b/a;
			System.out.println(divide);
			
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception is handled");
		}
		finally
		{
			System.out.println("No matter what i am alwaz there");
		}

	}

}
