package exam_revesion;
interface parent_96
{
	abstract void add();
}
interface parent_88
{
	abstract void sub();
}

public class Interface_1 implements parent_88,parent_96
{
	public static void main(String[] args) 
	{
		Interface_1 a1=new Interface_1();
		a1.add();
		a1.sub();
		
	}
	public void add()
	{
		System.out.println("Addition");
	}
	public void sub()
	{
		System.out.println("Substraction");
	}

}
