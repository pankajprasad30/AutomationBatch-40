package package1;

public class Method_Overloading 
{
	static void add(int a)// static
	{
		int sum=a+7;
		System.out.println(sum);
	}
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		add(100);
		add(101,102);	
	}

}
