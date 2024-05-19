package crossKT;
interface pankaj
{
	void add();//am
	default void sub()// after java 8 it can have default and static methods also
	{
		System.out.println("Subtraction");
	}
	static void mul()
	{
		
	}
}

public class Interface_1 implements pankaj
{

	public static void main(String[] args) 
	{
		Interface_1 a1=new Interface_1();
		a1.add();
		a1.sub();
		mul();
	}

	private static void mul() 
	{
		System.out.println("Mul");
		
	}

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

}
