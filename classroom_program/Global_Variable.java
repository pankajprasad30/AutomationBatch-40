package classroom_program;

public class Global_Variable 
{
	static int a=10;
    static float b=30.1f;
    static int c=30;
    
	static void add()
	{
		float sum=a+b+c;
		System.out.println(sum);
	}
	void mul()//non static
	{
		float mul=a*b;
		System.out.println(mul);
	}
	public static void main(String[] args) 
	{
		
		float sum=a+b+c;
		System.out.println(sum);
		add();
		Global_Variable a1=new Global_Variable();
		a1.mul();	
	}

}
