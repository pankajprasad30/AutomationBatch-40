//Find the Circumference of the Circle having 'pi' as static, final and Global and r via Scanner class
package assignments;

import java.util.Scanner;

public class Assignment_10 
{
	final static double pi=3.14;

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int r=s1.nextInt();
		double circum=2*pi*r;
		System.out.println("Circumference of circle : "+circum);
		
	}

}
