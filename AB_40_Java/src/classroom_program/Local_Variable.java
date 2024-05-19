package classroom_program;

public class Local_Variable 
{
	static void add()// static method
	{
		int a=40;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
	}
	void sub()// non static
	{
		int a=50;
		int b=10;
		int sub=a-b;
		System.out.println(sub);
		
	}

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		add();
		Local_Variable a1=new Local_Variable ();
		a1.sub();

	}

}
