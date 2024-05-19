//WAP with 3 methods main,static add and static subtract. Declare and initialize a and b global variables as non- static in nature and then perform addition and subtraction with static methods
package Official_Assignments;

public class Assignment_21 
{
	int a=10;
	int b=20;
	int add=a+b;
	int subtract=b-a;
	
	
	static void add()
	{	
		Assignment_21 a=new Assignment_21 ();
		System.out.println(a.add);
				
	}
	static void subtract()
	{
		Assignment_21 a=new Assignment_21 ();
		System.out.println(a.subtract);
		
	}

	public static void main(String[] args) 
	{
		add();
		subtract();

	}

}
