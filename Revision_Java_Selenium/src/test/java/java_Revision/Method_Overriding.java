package java_Revision;

class mummy
{
	 void add()
	{
		System.out.println("Mummy");
	}
}

public class Method_Overriding extends mummy
{
	 void add()
	{
		super.add();
		System.out.println("Addition");
	}

	public static void main(String[] args) 
	{
		Method_Overriding m1=new Method_Overriding();
		m1.add();
	
		
	}

}
