//WAP where in a class, there are 5 methods(3static, 2non static) with same name....first method argument is int a, second method argument is double a,third method argument is char a, fourth method argument is boolean a and fifth method argument is String a
package Official_Assignments;

public class Assignment_11 
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
		add('a');
		Assignment_11 a3=new Assignment_11();
		a3.add(true);
		a3.add("a");
	}

}
