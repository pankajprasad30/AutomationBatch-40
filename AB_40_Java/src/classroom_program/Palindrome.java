package classroom_program;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String a1=s1.next();
		//String a1="pankaj";
		String a2="";
		
		for (int i=a1.length()-1;i>=0;i--)
		{
			//System.out.println(a1.charAt(i));
			char rev=a1.charAt(i);
			a2=a2+rev;
		}
		//System.out.println(a2);
		if (a1.equals(a2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}