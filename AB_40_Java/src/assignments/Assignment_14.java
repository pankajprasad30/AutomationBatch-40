//To create 5 classes for Multilevel Inheritance
package assignments;
class five
{
	static void classfive()
	{
		System.out.println("classfive");
	}
}
class four extends five
{
	static void classfour()
	{
		System.out.println("classfour");
	}
}
class three extends four
{
	static void classthree()
	{
		System.out.println("classthree");
	}
}
class two extends three
{
	static void classtwo()
	{
		System.out.println("classtwo");
	}
}
class one extends two
{
	static void classone()
	{
		System.out.println("classone");
	}
}

public class Assignment_14 extends one
{

	public static void main(String[] args) 
	{
		classone();
		classtwo();
		classthree();
		classfour();
		classfive();
	}

}
