package classroom_program;

import java.util.Scanner;

public class Switch_Case_Scanner_1{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the swith no : Switch 1 is for Addition, Switch 2 is for Subtraction");
		int a=s1.nextInt();
		switch (a)
		{
		case 1: System.out.println("Case 1 : Addition of two no");
		System.out.println("Enter the value of b :");
		int b=s1.nextInt();
		System.out.println("Enter the value of c :");
		int c=s1.nextInt();
		int sum=b+c;
		System.out.println("Sum of two no is :"+sum);
		break;
		
		case 2: System.out.println("Case 2 : Subtraction of two no");
		System.out.println("Enter the value of d :");
		int d=s1.nextInt();	
		System.out.println("Enter the value of e :");
		int e=s1.nextInt();
		int sub=d-e;
		System.out.println("Subtraction of two no is :"+sub);
		break;
		
		default : System.out.println("Entered value of Switch is out of range ");
		}
		
		

	}

}
