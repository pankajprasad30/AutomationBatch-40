// Abstract class, 2 Abstract method, 2 concrete method
package classroom_program;

abstract class parent
{
	abstract void add();// AM 1
	abstract void subtract();// AM 2
	void multiply()//CM 1
	{
		System.out.println("Multiply");
	}
	static void divide()// CM 2
	{
		System.out.println("Divide");
	}
}
public class Abstract_Method extends parent
{
	public static void main(String[] args) 
	{
		 divide();
		 Abstract_Method a1=new Abstract_Method();
		 a1.add();
		 a1.multiply();
		 a1.subtract();
	}

	@Override
	void add() {
		System.out.println("Addition");
		
	}

	@Override
	void subtract() {
		System.out.println("Subtraction");
		
	}

}
