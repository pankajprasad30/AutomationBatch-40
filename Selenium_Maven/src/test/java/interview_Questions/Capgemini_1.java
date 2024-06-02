package interview_Questions;

public class Capgemini_1 {

	public static void main(String[] args) 
	{
		String name="Pankaj Prasad";
		String [] word=name.split(" ");
		String word1=word[0];
		String word2=word[1];
		
		for (int i=word1.length()-1;i>=0;i--)
		{
			System.out.print(word1.charAt(i));
		}
		System.out.print(" ");
		for (int i=word2.length()-1;i>=0;i--)
		{
			System.out.print(word2.charAt(i));
		}

	}

}
