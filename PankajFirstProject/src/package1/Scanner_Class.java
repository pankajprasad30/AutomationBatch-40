package package1;

import java.util.Scanner;
//import java.util.*;

public class Scanner_Class {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Print value of a:");
		int a = s1.nextInt ();
		System.out.println("Print value of b:");
		int b = s1.nextInt ();
		int sum=a+b;
		System.out.println("Sum of a+b:");
		System.out.println(sum);
		

	}

}
