//Program on Constructor Overloading 
package assignment_Questions_AB40;

public class Assignment_10 {
	Assignment_10()
	{
		System.out.println("Output from constructor : 1");
	}
	Assignment_10(int a)
	{
		System.out.println("Output from constructor : 2");
	}
	Assignment_10(int a,double b, boolean c)
	{
		System.out.println("Output from constructor : 3");
	}

	public static void main(String[] args) 
	{
		new Assignment_10();
		new Assignment_10(10);
		new Assignment_10(10,2.23,true);

	}

}
