package crossKT;

public class Variable_Types 
{
	static int c=30;
	static int d=90;
	static int sum1;
	static void add()// static method
	{
		final int a=20;
		int b=30;
		int sum=a+b;
		c=230;
		sum1=c+d;
		System.out.println(sum);
		System.out.println(sum1);
	}

	public static void main(String[] args) // Main method
	{
		
		add();

	}

}
