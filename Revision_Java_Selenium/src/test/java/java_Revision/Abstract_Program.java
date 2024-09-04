package java_Revision;

abstract class delhi
{// only in abstract class can have non static and abstract methods
	abstract void sub();//AM
	void div()
	{
		System.out.println("Division");
	}
}

public  class Abstract_Program extends delhi
{
	void add()// CM
	{
		System.out.println("Addition");
	}

	public static void main(String[] args) 
	{
		Abstract_Program a1=new Abstract_Program();
		a1.add();
		a1.sub();
		a1.div();

	}

	@Override
	void sub()
	{
		int a=20,b=300;
		System.out.println(a*b);
	
		
	}
	
	

}
