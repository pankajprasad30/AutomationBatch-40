package package1;

public class LogicalOperations_And
{
	public static void main(String[] args)
	{
	
		double q1=22.44;
		double q2=66.89;
		if (q2>q1 && q1!=55)
		{
			System.out.println(" All conditions are true");
		}
		if (q2==q1 && q1<q2)
		{
			System.out.println(" First False, Second true hence no output");
		}
		if (q2>q1 && q2<q1)
		{
			System.out.println("Fist true, scnd false, hense no output");
		}
		if (q1==q2 && q1>q2)
		{
			System.out.println("both are false hense no output");
		}
		byte a=-55;
		byte b=127  
				;
		if (b>a && b>1)
		{
			System.out.println(" Both are true, so output will be printed");
		}
				
	}

}
