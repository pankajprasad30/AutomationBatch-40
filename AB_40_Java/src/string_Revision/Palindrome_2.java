package string_Revision;

import java.util.Arrays;

public class Palindrome_2 
{
	public static void main(String[] args) 
	{
		String s1="Pnkaj";
		String s2="jaknaP";
		s1.toLowerCase();//pankaj
		s2.toLowerCase();//jankap
		if(s1.length()==s2.length())
		{
			char[] charArray1=s1.toCharArray();
			char[] charArray2=s2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean b1=Arrays.equals(charArray1, charArray2);
			if(b1)
			{
				System.out.println("anagram");
			}
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
