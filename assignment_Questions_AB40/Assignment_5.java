//To find if the given number is Odd/Even number
package assignment_Questions_AB40;

import java.util.Scanner;

public class Assignment_5 
{
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		if (num%2==0)
		{
			System.out.println(num+": Number is Even");
		}
		else
		{
			System.out.println(num+": Number is Odd");
		}

	}

}
