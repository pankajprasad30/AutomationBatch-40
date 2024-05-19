package type_casting;
class two
{
	void add()
	{
		System.out.println("Addition");
	}	
}
class one extends two
{
	void sub()
	{
		System.out.println("Subtraction");
	}	
}
class zero extends one
{
	void mul()
	{
		System.out.println("Multiplication");
	}	
}

public class Upcasting_Downcasting extends zero
{
	void div()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) 
	{
		zero a1= new Upcasting_Downcasting();// upcasting,implicitly
		a1.add();
		a1.mul();
		a1.sub();
		Upcasting_Downcasting z1= (Upcasting_Downcasting)a1;//downcasting, explicitly
		z1.add();
		z1.div();
		z1.mul();
		z1.sub();
	}

}
