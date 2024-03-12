//Execute the Scanner class with all the methods using Global Variables 
package assignments;

import java.util.Scanner;

public class Assignment_8 
{
	static int a;
	static int b;
	static int sum;
	static int sub;
	
	static void addition()
	{
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		sum=a+b;
		System.out.println("Output from addition : "+sum);
		
	}
	void subtract()
	{
		Scanner s2=new Scanner(System.in);
		a=s2.nextInt();
		b=s2.nextInt();
		sub=a-b;
		System.out.println("Output from subtraction :"+sub);	
	}
	
	public static void main(String[] args) 
	{
		addition();
		Assignment_8 a1=new Assignment_8();
		a1.subtract();
		
		

	}

}
