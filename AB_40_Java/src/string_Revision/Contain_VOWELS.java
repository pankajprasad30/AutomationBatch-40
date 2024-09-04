package string_Revision;


public class Contain_VOWELS {
 
	public static void main(String[] args)
	{
		String Name="hou@$se is 19y$%our sty25le but my min467`58989e is best";
		System.out.println(doesStringContainsVowels("house is your style but my mine is best"));
	}
	public static boolean doesStringContainsVowels(String input)
	{
		return input.toLowerCase().matches(".*[@,$,%]*.");
		
	}
 
}
 