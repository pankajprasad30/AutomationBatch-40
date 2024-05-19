//To print "I can vote" or "I cannot vote" by checking the age using IF ELSE statement
package assignment_Questions_AB40;

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int age=s1.nextInt();
		if(age>17)
		{
			System.out.println("I can vote");
		}
		else
		{
			System.out.println("I can not vote");
		}

	}

}
