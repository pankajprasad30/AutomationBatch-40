package java_Revision;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) 
	{
		String s1="pankaj";
		String s2="Jaknap";
		s1.toLowerCase();
		s2.toLowerCase();
		
		if(s1.length()==s2.length())
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean b1=Arrays.equals(ch1, ch2);
			if(b1)
			{
				System.out.println("Anagram");
			}
		}
		else
		{
			System.out.println("Not anagram");
		}

	}

}
