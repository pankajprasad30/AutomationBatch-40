//interface
package exam_revesion;
interface grand_parent1
{
abstract void add();
}
interface parent_44
{
abstract void sub();
}
public class child_33 implements parent_44,grand_parent1
{
    public static void main(String[]args)
	{
	child_33 a1=new child_33();
	a1.add();
	a1.sub();
	
	
	}
	public void add()
	{
	System.out.println("Addition");
	}
	public void sub()
	{
	System.out.println("Subtraction");
	}
}