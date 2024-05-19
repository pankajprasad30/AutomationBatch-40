package revesion;

public class Static_NonStatic 
{
	void add()
	{
		int a=30,b=80;
		System.out.println(a+b);
		
	}
	static void div()
	{
		double a=30,b=80;
		System.out.println(a/b);
	}

	public static void main(String[] args) 
	{
		div();
		Static_NonStatic a1=new Static_NonStatic ();
		a1.add();
		

	}

}
