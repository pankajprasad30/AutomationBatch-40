//WAP with combination of SIB, IIB, main method, constructor
package assignments;

public class Assignment_6 
{
	Assignment_6()
	{
		System.out.println("Output from constructor");
	}
	static
	{
		System.out.println("Output from SIB");
	}
	{
		System.out.println("Output from IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("Output from Main Method");
		new Assignment_6();

	}

}
