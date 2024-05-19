//WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. Multiply and divide in last two and call in main method.
package Official_Assignments;
public class Assignment_10 
{
	static void add()
	{
		int a=100;
		int b=200;
		int add=a+b;
		System.out.println(add);
	}
	static void subtract()	
	{
		int a=100;
		int b=200;
		int subtract=a-b;
		System.out.println(subtract);
	}
    void multiply()
    {
    	int c=300;
    	int d=400;
    	int multiply=c*d;
    	System.out.println(multiply);
    }
    void divide()
    {
    	double e=900;
        double f=660;
    	double divide=f/e;
    	System.out.println(divide);
    }
	public static void main(String[] args) 
	{
		add(); 
		subtract();		
		Assignment_10 a1=new Assignment_10 (); 
		a1.multiply();
		a1.divide();		
	}	
}
