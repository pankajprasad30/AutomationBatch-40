package string_array;

public class String_1 {

	public static void main(String[] args) 
	{
		String s1="Pankaj";
		for (int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		String p1="    Pankaj Prasad      ";
		System.out.println(p1.trim());
		System.out.println(s1.concat(p1));
		System.out.println(p1.contains("Pankaj"));
		System.out.println(p1.matches(s1));
		System.out.println(p1.isEmpty());
		System.out.println(p1.endsWith(""));
		
		
		
		
		
		
		
		/*System.out.println(s1);
		System.out.println(s1.indexOf('n'));
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals("Panka"));*/
		

	}

}
