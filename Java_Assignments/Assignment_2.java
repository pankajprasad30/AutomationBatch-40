//Create 4 static method with different name and call it inside the main method.
package assignments;

public class Assignment_2 
{
	static void add()
	{
		System.out.println("Addition");
	}
	static void subtract()
	{
		System.out.println("Substrac");
	}

	public static void main(String[] args) 
	{		
		System.out.println("Main Method");
		add();
		subtract();
		multiply();
		division();
	}
	static void multiply()
	{
		System.out.println("Multiply");
	}
	static void division()
	{
		System.out.println("Division");
	}

}
