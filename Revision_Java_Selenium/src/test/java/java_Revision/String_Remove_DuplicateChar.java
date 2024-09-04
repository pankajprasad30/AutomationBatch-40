package java_Revision;

public class String_Remove_DuplicateChar {

	public static void main(String[] args) 
	{
		String name="Pankaj Prasad";
		String result="";
		
		for (int i=0;i<name.length();i++)
		{
			String ch=""+name.charAt(i);
			if(result.contains(ch))
			{
				continue;
			}
			result +=ch;
		}
		System.out.println(result);

	}

}
