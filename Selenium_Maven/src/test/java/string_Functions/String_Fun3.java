package string_Functions;

public class String_Fun3 {

	public static void main(String[] args) 
	{
		String name="Pankaj Prasad 123 %&^%";
		String s1=name.replaceAll("[^0-9]"," ");
		System.out.println(s1);
		//System.out.println(s1.trim());
		

	}

}
