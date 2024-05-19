//To print "we can vote" if age >18 using IF statement
package assignment_Questions_AB40;

import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		if(age>17)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not-Eligible for vote");
		}

	}

}
