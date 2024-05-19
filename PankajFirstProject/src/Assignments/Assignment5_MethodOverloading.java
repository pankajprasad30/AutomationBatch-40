package Assignments;

public class Assignment5_MethodOverloading 
{
	static void add(int a)
	{
		System.out.println(a);
	}
	static void add(double a)
	{
		System.out.println(a);
	}
	static void add(char a1)
	{
		System.out.println(a1);
	}
	void add (boolean a)
	{		
		System.out.println("Pankaj 2");
	}
	void add(String Name)
	{
		System.out.println("Pankaj");
	}

	public static void main(String[] args) 
	{
		add(100);
		add(200);
		add(500);
		Assignment5_MethodOverloading a3=new Assignment5_MethodOverloading();
		a3.add(false);
	    a3.add("");
		
	}

}
