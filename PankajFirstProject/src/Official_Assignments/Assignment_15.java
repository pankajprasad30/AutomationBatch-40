//WAP with combination of SIB, IIB, main method, constructor
package Official_Assignments;

public class Assignment_15 
{
	Assignment_15()
	{
		System.out.println("constructor output");
		
	}
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	

	public static void main(String[] args) 
	{
		new Assignment_15 ();
		System.out.println("Main method");
		
	}

}
