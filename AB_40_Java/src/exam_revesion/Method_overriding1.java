//Again method overriding
package exam_revesion;
class pankaj
{
      void add()
	  {
	      System.out.println("Addition");
	  }
}

public class Method_overriding1 extends pankaj
{
      void add()
	  {
	  super.add();
	     System.out.println("Addition-1");
	  }
      public static void main(String[]args)
	  {
	  Method_overriding1 a1= new Method_overriding1();
	    a1.add();
	  }

}
