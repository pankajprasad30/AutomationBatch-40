package classroom_program;

import java.util.Scanner;

public class Scanner_Class_MainMethod {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		double b=s1.nextDouble();
		double sum=a+b;
		System.out.println(sum);
	}

}
