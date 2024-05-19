//Constructor-overloading
package exam_revesion;
public class Constructor_Overloading
{
      Constructor_Overloading()
	  {
	  System.out.println("Addition");
	  }
	  Constructor_Overloading(int a)
	  {
	  System.out.println("Addition-1");
	  }
      public static void main(String[]args)
	  {
	  new Constructor_Overloading();
	  new Constructor_Overloading(10);
	     
	  }
}