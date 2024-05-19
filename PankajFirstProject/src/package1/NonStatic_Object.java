package package1;

public class NonStatic_Object
{
	void add()// non static method
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	
	void subtract() // non static method
	{
		int a=10;
		int b=20;
		int subtract=a-b;
		System.out.println(subtract);
	}

	public static void main(String[] args) 
	{
		NonStatic_Object a1=new NonStatic_Object(); // remember syntax to create object
		a1.add();
		a1.subtract();

	}

}
