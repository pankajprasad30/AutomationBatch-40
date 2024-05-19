//Create 4 static method to perform arithmetic operations and call it inside the main method.
package assignments;

public class Assignment_3 
{
	static void add()
	{
		int a=30;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a=30;
		int b=50;
		int sub=b-a;
		System.out.println(sub);
	}
	static void multiply()
	{
		int a=30;
		int b=50;
		int multiply=a*b;
		System.out.println(multiply);
	}
	static void division()
	{
		float  a=30;
		float  b=50;
		float division=b/a;
		System.out.println(division);
	}

	public static void main(String[] args) 
	{
		add();// static method can be called by its method name
		sub();
		multiply();
		division();
		

	}

}
