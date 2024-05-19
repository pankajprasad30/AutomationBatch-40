package package1;

public class Constructor_Overloading 
{
	Constructor_Overloading()// non parameterized
	{
		System.out.println("Print 1");
	}
	Constructor_Overloading(int a)// parameterized
	{
		System.out.println("Print 2");
	}
	Constructor_Overloading(int b,int c)
	{
		System.out.println("Print 3");
	}
	
	public static void main(String[] args) 
	{
		new Constructor_Overloading();// how to call constructor- Ans by creating a object
		new Constructor_Overloading(0);
		new Constructor_Overloading(-128,127);
	}

}
