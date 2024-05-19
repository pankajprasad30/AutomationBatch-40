//Abstract class
package exam_revesion;
abstract class Abstract_11
{
     abstract void add();
}
public class Abstract_1 extends Abstract_11
{
     public static void main(String[]args)
	 {
	 Abstract_1 a1=new Abstract_1();
	 a1.add();
	      
	 }
	 void add()
	 {
	   System.out.println("Addition");
	 }
}