package package1;

public class Constructor_Addition 
{
	Constructor_Addition(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	Constructor_Addition (int a, int b)
	{
		int subtraction=a-b;
		System.out.println(subtraction);		
	}
	Constructor_Addition (double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		new Constructor_Addition (100000,2.2);
		new Constructor_Addition (2.2,3.3);
		new Constructor_Addition (30,40);
		

	}

}
