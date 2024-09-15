package java_Revision;

public class String_Palindrome {

	public static void main(String[] args) 
	{
		String input="radar";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
		}
		if (input.equals(output))
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
