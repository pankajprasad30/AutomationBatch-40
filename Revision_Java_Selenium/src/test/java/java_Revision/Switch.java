package java_Revision;

import java.util.Scanner;

public class Switch 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("two");
		break;
		case 3: System.out.println("three");
		break;
		case 4: System.out.println("four");
		break;
		default : System.out.println("Value is not wihin the range");
		}
		

	}

}
