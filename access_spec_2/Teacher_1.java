package access_spec_2;

public class Teacher_1 
{
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

}
