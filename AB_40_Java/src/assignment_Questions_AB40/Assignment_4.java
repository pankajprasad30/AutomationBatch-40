//To create 4 static method to perform arithmetic operations and call it inside the main method.
package assignment_Questions_AB40;

public class Assignment_4 
{
	static double a=20,b=30;

	static void add()
	{
		double Addition=a+b;
		System.out.println(Addition);
	}
	static void sub()
	{
		double Subtraction=b-a;
		System.out.println(Subtraction);
	}

	static void mul()
	{
		double Multiplication=a*b;
		System.out.println(Multiplication);
	}

	static void div()
	{
		double Division=b/a;
		System.out.println(Division);
	}


	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();

	}

}
