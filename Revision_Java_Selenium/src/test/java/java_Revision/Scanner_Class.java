package java_Revision;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		//String a1=s1.next();
		//System.out.println(a1);
		
		int q=s1.nextInt();
		int w=s1.nextInt();
		System.out.println(q+w);
		s1.close();

	}

}
