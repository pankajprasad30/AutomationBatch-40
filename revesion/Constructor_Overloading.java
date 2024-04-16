package revesion;

public class Constructor_Overloading 
{
	Constructor_Overloading ()
	{
		System.out.println("Output from 1st constructor");
	}
	Constructor_Overloading (int a)
	{
		System.out.println("Output from 2st constructor");
	}
	Constructor_Overloading (boolean b)
	{
		System.out.println("Output from 3st constructor");
	}
	

	public static void main(String[] args) 
	{
		new Constructor_Overloading ();
		new Constructor_Overloading (10);
		new Constructor_Overloading (false);
		

	}

}
