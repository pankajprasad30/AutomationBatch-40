//To create 5 Constructors with int, char, String, boolean & int a, boolean b, String s and call each one of them 
package assignment_Questions_AB40;

public class Assignment_11 {
	
	Assignment_11(int a)
	{
		System.out.println("Constructor : 1");
	}
	Assignment_11(char b)
	{
		System.out.println("Constructor : 2");
	}
	Assignment_11(String c)
	{
		System.out.println("Constructor : 3");
	}
	Assignment_11(boolean d, int a)
	{
		System.out.println("Constructor : 4");
	}
	Assignment_11(boolean b, String s)
	{
		System.out.println("Constructor : 5");
	}

	public static void main(String[] args) 
	{
		new Assignment_11(10);
		new Assignment_11('s');
		new Assignment_11("Pankaj");
		new Assignment_11(true,20);
		new Assignment_11(false,"Pankaj");

	}

}
