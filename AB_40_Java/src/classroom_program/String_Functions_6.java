package classroom_program;

public class String_Functions_6 {

	public static void main(String[] args) 
	{
		String a1="Pankaj";
		String a2="Pankllaj";
		System.out.println(a1.contains("P"));
		System.out.println(a1.matches("Pankaj"));
		System.out.println(a1.contains("Pankaj"));
		System.out.println(a1.equals("pankaj"));
		System.out.println(a2.isEmpty());
		System.out.println(a1.endsWith("j"));
		
		System.out.println(a1.replaceAll("P", " "));
		System.out.println(a1.replaceAll("P", "p"));
		
		String a3="Hello I Am From Bangalore";
		System.out.println(a3.replaceAll("[a-z]", ""));
		System.out.println(a3.replaceAll("[A-Z]", ""));
		System.out.println(a1.lastIndexOf("a"));
		System.out.println(a1.repeat(5));
		System.out.println(a1.equalsIgnoreCase(a2));// Doubtful need to check

	}

}
