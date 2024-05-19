package inheritange_multi;

class Multi_GrandParent1
{
	static void add()
	{
		System.out.println("I am Grand parent");
	}
}

class Multi_Parent1 extends Multi_GrandParent1
{
	void add(int a)
	{
		System.out.println("I am parent class");
	}
}

public class Multilevel_Inheritance extends Multi_Parent1
{

	public static void main(String[] args) 
	{
		System.out.println("I am child class");
		add();
		Multilevel_Inheritance s1=new Multilevel_Inheritance();
		s1.add(0);	
	}

}
