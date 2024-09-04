package java_Revision;

public class String_Reverse {

	public static void main(String[] args) 
	{
		String name="Pankaj Prasad";
		
		for (int i=name.length()-1;i>=0;i--)
		{
			char c1=name.charAt(i);
			System.out.print(c1);
			System.out.println(" ");
		}
		
		// reverse each word
		String []word=name.split(" ");
		String word1=word[0];
		String word2= word[1];
		
		for (int j=word1.length()-1;j>=0;j--)
		{
			System.out.print(word1.charAt(j));
		}
		System.out.println(" ");
		for (int j=word2.length()-1;j>=0;j--)
		{
			System.out.print(word2.charAt(j));
		}

	}

}
