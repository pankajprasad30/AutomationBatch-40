package java_Revision;
class papa
{
	static void papa1()
	{
		System.out.println("papa");
	}
}
class mom
{
	static void mom1()
	{
		System.out.println("mom");
	}
	
}

public class Multiple_Inheritance    extends mom //extends papa
{

	public static void main(String[] args) 
	{
		mom1();
		//papa1();
		

	}

}