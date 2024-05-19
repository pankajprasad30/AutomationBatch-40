// WAP for Scanner class
package exam_revesion;

import java.util.Scanner;

public class Scanner_1
{
   public static void main(String[]args)
   {
      Scanner s1=new Scanner(System.in);
	  int a=s1.nextInt();
	  int b=s1.nextInt();
	  int sum=a+b;
	  System.out.println(sum);
   }
}