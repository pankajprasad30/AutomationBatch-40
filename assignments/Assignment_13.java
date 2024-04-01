//Area of Circle (pi*r*r) with human input at the Run time for 10 times
package assignments;

import java.util.Scanner;

public class Assignment_13 
{
	static double pi=3.14;
	static int r;
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter the value of radius");
		r=s1.nextInt();
	    double area=pi*r*r;
		System.out.println("Area of circle is : "+area);

	}

}
