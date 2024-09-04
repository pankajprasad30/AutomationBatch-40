package java_Revision;

public class Constructor_Overloading 
{
	Constructor_Overloading()
	{
		System.out.println("1");
	}
	Constructor_Overloading(int b)
	{
		System.out.println("2");
	}
	Constructor_Overloading(boolean a)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		new Constructor_Overloading();
		new Constructor_Overloading(2);
		new Constructor_Overloading(false);
		

	}

}
