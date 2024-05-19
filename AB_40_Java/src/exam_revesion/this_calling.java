//this calling statement
package exam_revesion;
public class this_calling
{
       this_calling()
	   {
	     System.out.println("Prasad");
	   }
	   this_calling(int a)
	   { 
	   this();
	      System.out.println("Pankaj");
	   }

      public static void main(String[]args)
	  {
	    new this_calling (10);
	  }
}