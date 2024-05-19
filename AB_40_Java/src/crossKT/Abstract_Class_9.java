package crossKT;
abstract class parent_9
{
	abstract void add();
	abstract void sub();
	abstract void div();
	abstract void mul();
	abstract void mod();
	
	
}
public class Abstract_Class_9 extends parent_9
{
	public static void main(String[] args) 
	{
		Abstract_Class_9 a1=new Abstract_Class_9();
		a1.add();
		a1.sub();
		a1.div();
		a1.mod();
		a1.mul();
	}

	@Override
	void add() {
		System.out.println("Addition");
		
	}

	@Override
	void sub() {
		System.out.println("subtraction");
		
	}

	@Override
	void div() {
		System.out.println("Division");
		
	}

	@Override
	void mul() {
		System.out.println("Multiplication");
		
	}

	@Override
	void mod() {
		System.out.println("Modulus");
		
	}

}
