package crossKT;

abstract class Ram
{
	//abstract void add();//  Abstract method
	abstract void sub();//  Abstract method
	void multiply() // Concrete method or Non-Static method
	{
		System.out.println("Multiply");
	}
}
public class Abstract_1 extends Ram
{

	public static void main(String[] args) 
	{
		Abstract_1 a1=new Abstract_1();
		a1.multiply();
		a1.sub();
		
	}

	//@Override
	void sub() 
	{
		System.out.println("Sita");
		
	}

}
