package access_specifier;

public class Access_specifier_1 
{
	private static void mod()
	{
		System.out.println("Modulus");
	}
	private void add()
	{
		System.out.println("Private : Addition");
	}
	public void sub()
	{
		System.out.println("Public : Subtraction");
	}
	protected void div()
	{
		System.out.println("Protected : Division");
	}
	void mul()
	{
		System.out.println("Deafult/Package : Multiplication");
	}
	public static void main(String[] args) 
	{
		mod();
		Access_specifier_1 a1= new Access_specifier_1();
		a1.add();
		a1.sub();
		a1.div();
		a1.mul();
	}

}
