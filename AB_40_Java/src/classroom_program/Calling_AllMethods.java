package classroom_program;

public class Calling_AllMethods 
{
	Calling_AllMethods ()
	{
		System.out.println("I am constructor");
	}
	{
		System.out.println("I am IIB");
	}
	static
	{
		System.out.println("I am SIB");
	}
	

	public static void main(String[] args) 
	{
		System.out.println("I am main method");
		//Calling_AllMethods a1=new Calling_AllMethods ();
		new Calling_AllMethods();
		
				
		

	}

}
