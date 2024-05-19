package Assignments;

public class Global_Static 
{
	static int a; //Declaration
	static int b;

	static void add()
	{
		a=30;// Initialization
		b=90;
		int add=a+b;
		System.out.println(add);
				
	}
	static void subtract()
	{
		a=50;
		b=80;
		int subtract=b-a;
		System.out.println(subtract);
		
	}

	public static void main(String[] args) 
	{
		add();
		subtract();
		

	}

}
