package exam_revesion;
abstract class parent_99
{
	abstract void add();
	void sub()
	{
		System.out.println("Subtraction");
	}
}

public class Abstract_class extends parent_99
{
	void add() 
	{
		System.out.println("Addition");
	
	}
	public static void main(String[] args) 
	{
		Abstract_class a1=new Abstract_class();
		a1.add();
		a1.sub();
		
	}

	
	
	
}