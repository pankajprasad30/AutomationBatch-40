package classroom_program;
interface parent_22
{
	void add();
}
interface parent_11
{
	void sub();
}

public class Interface_11 implements parent_11,parent_22
{

	public static void main(String[] args) 
	{
		Interface_11 a1=new Interface_11();
		a1.add();
		a1.sub();

	}

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

	@Override
	public void sub() {
		System.out.println("Substraction");
		
	}

}
