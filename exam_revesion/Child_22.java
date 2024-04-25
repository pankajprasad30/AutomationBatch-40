//Super calling statement
package exam_revesion;
class parent_65
{
    parent_65()
	{
	   System.out.println("Parent class");
	}
}
public class Child_22 extends parent_65
{
     Child_22()
	 {
	    System.out.println("Child class");
	 }
    public static void main(String[]args)
	{
	     new Child_22();
	}
}