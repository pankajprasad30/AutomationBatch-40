// interface class
package exam_revesion;
interface Interface_55
{
    abstract void add();
}
public class Interface_44 implements Interface_55
{
    public static void main(String[]args)
	{
	Interface_44 a1=new Interface_44();
	a1.add();
	}
	public void add()
	{
	   System.out.println("Addition");
	}
}