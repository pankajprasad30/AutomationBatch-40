package java_Revision;

class GrandParent
{
	static void add()
	{
		System.out.println("one");
	}
}
class parent1 extends GrandParent
{
	static void sub()
	{
		System.out.println("two");
	}
	
}

public class Multi_Level_Inheritance extends parent1
{
	static void div()
	{
		System.out.println("three");
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		div();

	}

}
