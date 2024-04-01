package exception_handeling;

public class EH_1 {

	public static void main(String[] args) 
	{
		
		try
		{
			int a=0/1;
			System.out.println(a);
			
		}
		catch(ArithmeticException a1)
		{
			System.out.println(" int datatype can not story infinate value");
		}
		

	}

}
