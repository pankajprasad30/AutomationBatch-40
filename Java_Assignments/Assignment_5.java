//create 5 constructor and Call it inside Main Method
package assignments;

public class Assignment_5 
{
	Assignment_5 ()
	{
		System.out.println("Output from 1st constructor");
	}
	Assignment_5 (int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	Assignment_5 (int a, float b)
	{
		float substraction=b-a;
		System.out.println(substraction);		
	}
	Assignment_5 (int b, double c)
	{
		double multiply=b*c;
		System.out.println(multiply);		
	}
	Assignment_5(double a, int b)
	{
		double add=a+b;
		System.out.println(add);		
	}
	
	public static void main(String[] args) 
	{
		new Assignment_5 ();
		new Assignment_5 (10,20);
		new Assignment_5 (30, 23.5f);
		new Assignment_5 (70,50.55);
		new Assignment_5 (10.99,10);

	}

}
