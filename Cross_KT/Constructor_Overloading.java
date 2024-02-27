package crossKT;

public class Constructor_Overloading 
{
	Constructor_Overloading ()
	{
		System.out.println("Pankaj");
	}
	Constructor_Overloading (int a)
	{
		System.out.println("Ruhi");
	}
	Constructor_Overloading (boolean a,boolean b)
	{
		System.out.println("Amazon");
	}
	Constructor_Overloading(int a,int b)
	{
		System.out.println("Falipkart");
	}

	public static void main(String[] args) 
	{
		new Constructor_Overloading ();// 1st method
		//Constructor_Overloading a1=new Constructor_Overloading ();// 2nd method
		new Constructor_Overloading (true, true);
		new Constructor_Overloading (20);
		new Constructor_Overloading(10,20);

	}

}
