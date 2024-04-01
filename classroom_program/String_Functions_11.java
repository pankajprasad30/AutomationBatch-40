package classroom_program;

public class String_Functions_11 
{

	public static void main(String[] args) 
	{
		String a1= "Pankaj";
		System.out.println(a1);
		System.out.println(a1.length());//start from 1
		System.out.println(a1.charAt(1));//start from 0
		System.out.println(a1.indexOf("j"));
		System.out.println(a1.toUpperCase());
		System.out.println(a1.toLowerCase());
		System.out.println(a1.equals("pankaj"));
		
		boolean a2=a1.equals("Pankaj");
		System.out.println(a2);
		
		String q1="   Hello my name is pankaj    ";// trim
		System.out.println(q1.trim());
		
		String name="Pankaj";
		String sarname="Prasad";
		String name1=" Darshika";
		System.out.println(name.concat(" ").concat(sarname).concat(name1));
		
		String w1="Pankaj";
		System.out.println(w1.substring(2));
		System.out.println(w1.substring(1, 5));
		
		String e1="Hello how are you ?";
		System.out.println(e1.substring(0, 5));
		System.out.println(e1.substring(6, 9));
		System.out.println(e1.substring(18));
		

	}

}
