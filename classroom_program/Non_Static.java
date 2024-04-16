package classroom_program;

public class Non_Static 
{
	void add()
	{
		int a=10,b=30;
		int add=a+b;
		System.out.println(add);
	}

	public static void main(String[] args) 
	{
		
		Non_Static a1=new Non_Static();
		a1.add();
	}

}
