package exam_revesion;
class globe
{
	void add()
	{
		System.out.println("Addition");
	}
	
}
class india extends globe
{
	void sub()
	{
		System.out.println("Substraction");
	}
	
}

public class TypeCast_Class extends india
{
	void div()
	{
		System.out.println("Division");
	}

	public static void main(String[] args) 
	{
		india a1=new TypeCast_Class();// upcasting , impli
		a1.add();
		a1.sub();
		TypeCast_Class z1=(TypeCast_Class)a1; //downcasting, expli
		z1.add();
		z1.sub();
		z1.div();
		

	}

}
