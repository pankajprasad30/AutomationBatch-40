package classroom_program;
class Parent_Class
{
	 void add()
	{
		System.out.println("Adding 3 numbers");	
	}
}
public class Method_Overriding_1 extends Parent_Class
{
	void add()
	{
	super.add();	
	System.out.println("Adding 2 numbers");	
	}
	public static void main(String[] args) 
	{
		Method_Overriding_1 m1= new Method_Overriding_1();
		//Parent_Class b1=new Parent_Class();
		m1.add();
	}

}
