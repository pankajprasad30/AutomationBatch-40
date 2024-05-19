package classroom_program;

public class String_Functions_Special_Character {

	public static void main(String[] args) 
	{
		String a1="jANLKNDKLkhkjshfjksdhfjk*^%(*&^#*!@&";
		String b1=a1.replaceAll("[a-z]", "");
		String c1=b1.replaceAll("[A-Z]", "");
		System.out.println(c1);
		

	}

}
