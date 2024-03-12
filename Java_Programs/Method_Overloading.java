package classroom_program;

public class Method_Overloading 
{
	void add()
	{
		System.out.println("Pankaj");
	}
	static void add(int a)
	{
		System.out.println("Prasad");
	}

	public static void main(String[] args) 
	{
		Method_Overloading a1=new Method_Overloading ();
		a1.add();
		add(10);

	}

}
