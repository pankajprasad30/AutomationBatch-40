//Find the Area of the Circle having 'pi' as static, final and Global with int radius and double radius using Scanner class
package assignments;

import java.util.Scanner;

public class Assignment_9 
{
	final static double pi=3.14;
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		double r=s1.nextDouble();
		double areaofcircle=pi*r*r;
		System.out.println(areaofcircle);

	}

}
