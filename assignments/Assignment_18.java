//Find out future time in 10days
package assignments;
import java.util.Scanner;

public class Assignment_18 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String a1=s1.next();
		String a2="";		
		for (int i=a1.length()-1;i>=0;i--)
		{
			char rev=a1.charAt(i);
			a2=a2+rev;
		}
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
