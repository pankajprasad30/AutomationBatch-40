package string_Revision;

public class Class_3 
{

	public static void main(String[] args) 
	{
		String s1="Pankaj Prasad 1231231";// PPRASAD // 1231231 Pankaj Prasad
		
		String s3="", r="";
		for (int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
			if(Character.isDigit(s2)==true)
			{
				s3=s3+s2;
			}
			else
			{
				r=r+s2;
			}
		}
		System.out.println(s3);
		System.out.println(r);

	}

}
