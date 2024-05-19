package crossKT;
interface mother
{
	void add();
}
interface daughter extends mother
{
	void subtract();
}
public class Interface_2  implements daughter,mother //implements daughter
{

	public static void main(String[] args) 
	{
		Interface_2 a1=new Interface_2();
		a1.add();
		a1.subtract();

	}

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

	@Override
	public void subtract() {
		System.out.println("Subtraction");
		
	}

}
