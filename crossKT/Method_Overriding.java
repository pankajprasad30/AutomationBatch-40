package crossKT;

class parent_11
{
	void add()
	{
		System.out.println("pankaj");
		
	}
}
public class Method_Overriding extends parent_11
{
	void add()
	{
		System.out.println("panka j");
		super.add();
	}

	public static void main(String[] args) 
	{
		Method_Overriding s1=new Method_Overriding ();
		s1.add();

	}

}
