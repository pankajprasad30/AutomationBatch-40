package exam_revesion;

class parent_87
{
	parent_87()
	{
		System.out.println("parent class");
	}
	
}

public class SuperCalling_1 extends parent_87
{
	SuperCalling_1 ()
	{
		//super();
		System.out.println("Child class");
	}
	public static void main(String[] args) 
	{
		//SuperCalling_1 a1=new SuperCalling_1 ();
		new SuperCalling_1 ();

	}

}
