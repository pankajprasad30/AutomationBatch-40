public class Palindrom_String_program {
 
	public static void main(String[] args)
	{
		String input="radar";
		String output="";
	//	System.out.println(input.length());
		
		for(int i=input.length()-1;i>=0;i--)
		{
			System.out.print(input.charAt(i));
			output=output+input.charAt(i);
			System.out.println(output);
			}
		if(input.equals(output))
		{
			System.out.println("it is plaindrom");
		}
		else
		{
			System.out.println("it is not palindrom");
		}
 
	}
 
}
 