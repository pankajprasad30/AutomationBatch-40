package package1;

public class IIB_Block 
{
	{
		System.out.println("Hi Mr IIB");
	}
	{
		System.out.println("IIB_2");
	}

	public static void main(String[] args) 
	{
		System.out.println("Print 1");
		new IIB_Block();// IIB gets called automatically when object gets called
	}

}
