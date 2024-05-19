//Write a non static method and call it inside the main method
package Official_Assignments;

public class Assignment_5 
{
	void add()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		Assignment_5 a1=new Assignment_5 ();
		a1.add();

	}

}
