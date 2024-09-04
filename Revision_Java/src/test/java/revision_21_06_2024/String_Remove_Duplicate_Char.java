package revision_21_06_2024;

public class String_Remove_Duplicate_Char 
{

	public static void main(String[] args) 
	{
		String str="Pankaj Prasad";
		
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			String ch=""+str.charAt(i);
			//System.out.print(ch);
			if(result.contains(ch))
			{
				continue;
			}
			result +=ch;
			//System.out.print(ch);
			
		}
		System.out.println(result);
	}

}
