package revision_02_07_2024;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String s2=s1.next();
		//String s2="Pankaj Prasad";
		for (int i=s2.length()-1;i>=0;i--)
		{
			System.out.print(s2.charAt(i));
		}

	}

}
