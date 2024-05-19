package string_Functions;

public class String_Func {

	public static void main(String[] args) 
	{
		String name="   Hello My name is Pankaj & *&^@!*&#^)!   q";
		String name1="Pankaj";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf('a'));
		System.out.println(name.equals("Pankaj"));
		System.out.println(name.contains("Pankaj"));
		System.out.println(name.matches("Pankaj"));
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(name.trim());
		System.out.println(name.endsWith(" "));
		System.out.println(name.replace('H', 'Q'));
		System.out.println(name.replaceAll("Pankaj", "Prasad"));
		System.out.println(name.concat(name1));
		System.out.println(name + name1);
		System.out.println(name.concat(" ").concat(name1));
		System.out.println(name.substring(6));
		System.out.println(name.substring(6, 44));
		
		for(int i=0;i<name1.length();i++)
		{
			System.out.println(name1.charAt(i));
		}
		for(int i=name1.length()-1;i>=0;i--)
		{
			System.out.print(name1.charAt(i));
		}
		

	}

}
