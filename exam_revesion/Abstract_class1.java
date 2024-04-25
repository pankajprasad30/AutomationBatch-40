//Abstract class
package exam_revesion;
abstract class parent_55
{
    abstract void add();
}
public class Abstract_class1 extends parent_55
{
    void add()
	{
	   System.out.println("Addition");
	}
    public static void main(String[]args)
	{
	 Abstract_class a1=new  Abstract_class();
	 a1.add();
	}
}