package string_Revision;

public class Class_2 {

	public static void main(String[] args) 
	{
		
		String s1="Pankaj Prasad";
		int count=0;
		int count1=0;
		
		//System.out.println(s1.replaceAll("[^a-z]", ""));
		
		for(int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
			//System.out.print(s2);
			//ASCII 
			//System.out.println( s2+":"+(int)s2);
			if(Character.isUpperCase(s2)== true)
			{
				count++;
				System.out.print(s2);
			}
			if(Character.isLowerCase(s2)==true)
			{
				count1++;
				//System.out.print(s2);
			}
		}
		System.out.println(count);
		System.out.println(count1);
		
		

	}

}
