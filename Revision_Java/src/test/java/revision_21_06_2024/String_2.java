package revision_21_06_2024;

public class String_2 {

	public static void main(String[] args) 
	{
		String name="Pankaj Prasad";
		
		for (int i=name.length()-1;i>=0;i--)
		{
			//System.out.print(name.charAt(i));
		}
		
		String word[]=name.split(" ");
		String word1=word[0];
		String word2=word[1];
		System.out.println(word1);
		System.out.println(word2);
		
		for (int i=word1.length()-1;i>=0;i--)
		{
			System.out.print(word1.charAt(i));
		}

	}

}
