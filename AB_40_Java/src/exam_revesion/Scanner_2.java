//scanner with switch
package exam_revesion;
import java.util.Scanner;
public class Scanner_2
{
    public static void main (String[]args)
	{
	       Scanner s1=new Scanner(System.in);
		   
		   int a=s1.nextInt();
		   switch(a)
		   {
		   case 1: System.out.println("one");
		   break;
		   case 2: System.out.println("two");
		   break;
		   case 3: System.out.println("three");
		   break;
		   default : System.out.println("default");
		   }
	}
}