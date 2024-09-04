package string_Revision;

public class Palindrome {

	public static void main(String[] args) 
	{
		String s1="radar";
		
		StringBuffer s2=new StringBuffer(s1);
	    s2.reverse();
		//System.out.println(s3);
		
		if(s1.equals(s2.toString()))
			//if(s1.equals(s2)==true)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		

	}

}
