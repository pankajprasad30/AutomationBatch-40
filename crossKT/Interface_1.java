package crossKT;
interface pankaj
{
	void add();
	default void sub()
	{
		System.out.println("Subtraction");
	}
	static void mul()
	{
		System.out.println("Mul");
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

	private static void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

}
