package Assignments;

public class Assignment4_Static_NonStatic 
{

	static void add()// static
	{
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}
	static void subtract()// static
	
	{
		int a=10;
		int b=20;
		int subtract=a-b;
		System.out.println(subtract);
	}
    void multiply()// non-static
    {
    	int c=30;
    	int d=40;
    	int multiply=c*d;
    	System.out.println(multiply);
    }
    void divide()// non-static
    {
    	double e=50;
        double f=66;
    	double divide=f/e;
    	System.out.println(divide);
    }
	public static void main(String[] args) 
	{
		add(); // call static method inside main method
		subtract();
		
		Assignment4_Static_NonStatic a1=new Assignment4_Static_NonStatic (); // use this to call constructor
		a1.multiply();// call non static method
		a1.divide();
		
		
	}

}
