
package package1;

public class ConditionalStatement_If_Else_If {
	public static void main(String[] args) 
	{ 
		int a = 10;
		int b = 20;
		int c = 30;
		if (c < a) 
		{
			System.out.println("Print 1");
		}
		else if (a >= b) // in this, there can be any numbers of else if block
		{
			System.out.println("Print 2");
		}
		else if (a < c) 
		{
			System.out.println("Print 3");
		}
		else
		{
			System.out.println("Print 4");
		}

	}
	
}
