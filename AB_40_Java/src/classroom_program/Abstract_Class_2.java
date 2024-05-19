package classroom_program;

abstract class parent_2
{
	abstract void add(); // remember there is no implementation
}

public class Abstract_Class_2 extends parent_2
{

	public static void main(String[] args) 
	{
		Abstract_Class_2 a1=new Abstract_Class_2();
		a1.add();

	}

	@Override
	void add() {
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println(sum);
		
	}

}
