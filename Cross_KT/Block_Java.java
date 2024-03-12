package crossKT;

public class Block_Java 
{
	static void add()// Static Method
	{
		System.out.println("Addition");
	}
	static // SIB
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");// IIB 
	}
	void multiplication()// Non-Static
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] args) 
	{
		
		Block_Java a1= new Block_Java();
		
		add();
		a1.multiplication();
		

	}

}
