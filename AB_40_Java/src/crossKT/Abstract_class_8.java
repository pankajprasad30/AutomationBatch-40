package crossKT;
abstract class father
{
	abstract void add();// AM
	void sub()
	{
		System.out.println("Subtraction"); //CM
	}
	static void mul()
	{
		System.out.println("Multiplication");// CM
	}
	
}
public class Abstract_class_8 extends father
{

	public static void main(String[] args) 
	{
		Abstract_class_8 a1=new Abstract_class_8();
		a1.add();
		a1.sub();
		mul();

	}

	@Override
	void add() {
		System.out.println("Addition");
		
	}

}
