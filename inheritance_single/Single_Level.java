package inheritance_single;


class Parent // super class
{
	static void sub()
	{
		System.out.println("Subtraction");
	}
}

public class Single_Level extends Parent // subclass
{

	public static void main(String[] args) 
	{
		System.out.println("I Am Child Class");
		sub();

	}

}
