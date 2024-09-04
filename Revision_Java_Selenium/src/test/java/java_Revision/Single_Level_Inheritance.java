package java_Revision;

class parent
{
	static void add()
	{
		System.out.println("Pankaj");
	}
}

public class Single_Level_Inheritance extends parent 
{
	static void sub()
	{
		System.out.println("Prasad");
	}

	public static void main(String[] args) 
	{
		add();
		sub();

	}

}
