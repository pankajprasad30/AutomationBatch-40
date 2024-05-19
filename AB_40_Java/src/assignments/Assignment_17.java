//Check if, the given String is Palindrome or not at run time
package assignments;

import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String name1=s1.next();
		String name2="";
		System.out.println(name1);
		for(int i=name1.length()-1;i>=0;i--)
		{
			
			System.out.println(name1.charAt(i));
		}
		
	}

}
