package Assignments;

public class Global_NonStatic 
{
	int a=10;
	int b=20;
	int add=a+b;
	int subtract=b-a;
	
	
	static void add()
	{	
		Global_NonStatic a=new Global_NonStatic ();
		System.out.println(a.add);
				
	}
	static void subtract()
	{
		Global_NonStatic a=new Global_NonStatic ();
		System.out.println(a.subtract);
		
	}
	public static void main(String[] args) 
	{
		
		add();
		subtract();
		
		

	}

}
