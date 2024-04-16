package revesion;

public class Method_Overloading 
{
	void add()
	{
		System.out.println("Print : 1");
	}
	void add(int a)
	{
		System.out.println("Print : 2");
	}
	static void sub()
	{
		System.out.println("Print : 3");
	}
	static void sub(String b)
	{
		System.out.println("Print : 4");
	}


	public static void main(String[] args) 
	{
		sub();
		sub("Pankaj");
		Method_Overloading a1= new Method_Overloading ();
		a1.add();
		a1.add(10);
		
		
	}

}
