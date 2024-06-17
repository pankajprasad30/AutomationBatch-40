package revision_13_06_2024;

public class String_1 
{
	public static void main(String[]args)
	{
		String name="Pankaj Prasad";
		String []Words=name.split(" ");
		String word1=Words[0];
		String word2=Words[1];
		
		for(int i=word1.length()-1;i>=0;i--)
		{
			System.out.print(word1.charAt(i));
		}
		System.out.print(" ");
		for(int i=word2.length()-1;i>=0;i--)
		{
			System.out.print(word2.charAt(i));
		}
		
	}

}
