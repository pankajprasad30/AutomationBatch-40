//Single level inheritance
package exam_revesion;
class grandparent
{
      static void add()
	  {
      System.out.println("GP class");
	  }
}
class parent_9 extends grandparent
{
      static void sub()
	  {
      System.out.println("Parent class");
	  }
}
public class inheritance extends parent_9
{
    public static void main(String[]args)
	{
	   System.out.println("Child class");
	   add();
	   sub();
	}
}