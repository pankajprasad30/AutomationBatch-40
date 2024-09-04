package revision_02_07_2024;

public class Static_NonStatic_Methods 
{
	static void Method_1()
	{
		System.out.println("Method_1");
	}
	void Method_2()
	{
		System.out.println("Method_2");
	}

	public static void main(String[] args) 
	{
		Static_NonStatic_Methods.Method_1();
		//Method_2();
		Static_NonStatic_Methods s1=new Static_NonStatic_Methods();
		s1.Method_2();
		Static_NonStatic_Methods.Method_1();

	}

}
