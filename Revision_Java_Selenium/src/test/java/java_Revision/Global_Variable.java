package java_Revision;

public class Global_Variable 
{
	static final int a=20;
	
	
	void sub()
	{
		//a=30;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		System.out.println(a);
		Global_Variable g1=new Global_Variable();
		g1.sub();

	}

}