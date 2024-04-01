package classroom_program;

import java.util.Scanner;

public class Scanner_111 
{

	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a=a1.nextInt();
		System.out.println("Enter the value of B: ");
		int b=a1.nextInt();
		int sum=a+b;
		System.out.println("Sum of A+B:"+sum);
	}

}
