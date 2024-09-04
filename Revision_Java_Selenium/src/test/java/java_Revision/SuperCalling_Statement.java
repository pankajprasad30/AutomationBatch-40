package java_Revision;

class India
{
	India(int a)
	{
		System.out.println("India");
	}
}
public class SuperCalling_Statement extends India
{
	SuperCalling_Statement()
	{
		super(10);
		System.out.println("SuperCalling_Statement");
	}

	public static void main(String[] args) 
	{
		new SuperCalling_Statement();

	}

}
