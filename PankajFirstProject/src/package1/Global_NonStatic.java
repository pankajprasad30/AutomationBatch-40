package package1;

public class Global_NonStatic 
{ 
	static String name="Pankaj" ;
	static int a=10;
	static double pi=3.14; // Instance Variable
	void add()
	{
		int a=10, b=20;
		int add=a+b;
		System.out.println(add);
		
	}
	


	public static void main(String[] args) 
	{
		System.out.println(name);
		System.out.println(a);
		
		Global_NonStatic pankaj=new Global_NonStatic ();
		System.out.println(pankaj.pi);
		pankaj.add();
		

	}

}
