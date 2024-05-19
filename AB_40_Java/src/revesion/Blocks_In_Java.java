package revesion;

public class Blocks_In_Java 
{
	static// SIB
	{
		System.out.println("Print-1");
	}
	{
		System.out.println("Print-2");// IIB
	}
	static void add()
	{
		System.out.println("Print-3");
	}
	void sub()
	{
		System.out.println("Print-4");
	}

	public static void main(String[] args) 
	{
		add();
		Blocks_In_Java a1= new Blocks_In_Java();
		a1.sub();
		

	}

}
