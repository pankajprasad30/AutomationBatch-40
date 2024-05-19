package package1;

public class SIB_IIB_Blocks 
{
	static
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}

	public static void main(String[] args) 
	{
		new SIB_IIB_Blocks();
		System.out.println("Main method");
		
	}

}
