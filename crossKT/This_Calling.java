package crossKT;

public class This_Calling 
{
	This_Calling ()
	{
		
		System.out.println("Pankaj");
	}
	This_Calling (int a)
	{
		this();
		System.out.println("Prasad");
	}

	public static void main(String[] args) 
	{
		new This_Calling (10);

	}

}
