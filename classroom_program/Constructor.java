package classroom_program;

public class Constructor 
{
	Constructor()
	{
		System.out.println("Pankaj");//constructor
	}
	Constructor(int a, int b)
	{
		System.out.println("Pankaj_1");//constructor
	}

	public static void main(String[] args) 
	{
		//Constructor a1=new Constructor ();// 1st method to call constructor
		//Constructor b1=new Constructor (10,99);
		
		new Constructor ();// 2nd method to call constructor
		
		new Constructor (29,87);

	}

}
