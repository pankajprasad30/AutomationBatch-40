package java_Revision;

public class Method_Overloading 
{
	static void pankaj()
	{
		System.out.println("1");
	}
	static void pankaj(int a)
	{
		System.out.println("2");
	}
	void prasad()
	{
		System.out.println("3");
	}
	void prasad(int a)
	{
		System.out.println("4");
	}

	public static void main(String[] args) 
	{
		pankaj();
		pankaj(10);
		
		Method_Overloading m1=new Method_Overloading();
		m1.prasad();
		m1.prasad(30);

	}

}
