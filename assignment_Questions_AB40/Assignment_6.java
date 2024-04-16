//To call non static method inside the main method
package assignment_Questions_AB40;

public class Assignment_6 
{
	void add()
	{
		System.out.println("Addition");
	}

	public static void main(String[] args) 
	{
		Assignment_6 a1=new Assignment_6();
		a1.add();

	}

}
