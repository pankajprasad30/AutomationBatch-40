//Write many non static method and call it inside the main method
package Official_Assignments;

public class Assignment_6 
{
	void divide()
	{
	double a=20;
	double b=7;
	double divide=a/b;
	System.out.println(divide);
	}
	 void multiply()
	    {
	    	int c=30;
	    	int d=40;
	    	int multiply=c*d;
	    	System.out.println(multiply);
	    }
	 void add()
	 {
		 int z=300000;
		 int x=33;
		 int add=z+x;
		 System.out.println(add);
	 }
	public static void main(String[] args) 
	{
		Assignment_6 a=new Assignment_6 ();
		a.divide();
		a.multiply();
		a.add();
	}
}

	



