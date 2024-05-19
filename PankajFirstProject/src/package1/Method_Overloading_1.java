package package1;

public class Method_Overloading_1 
{
	void add(int a) // Non-static
	{
		int sum=a+9;
		System.out.println(sum);
	}
	void add (int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		Method_Overloading_1 a1=new Method_Overloading_1();
		a1.add(1000);
		a1.add(200, 330);
		

	}

}
