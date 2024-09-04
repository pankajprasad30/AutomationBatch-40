package revision_21_06_2024;

public class String_1 
{
	public static void main(String[]args)
	{
		String name="Pankaj Prasad";
		String name1=" Darshika Prasad ";
		
		int i1=name.length();
		System.out.println(i1);
		
		char c1=name.charAt(3);
		System.out.println(c1);
		
		String upp_s=name.toUpperCase();
		System.out.println(upp_s);
		
		String low_s=name.toLowerCase();
		System.out.println(low_s);
		
		int ind=name.indexOf('j');
		System.out.println(ind);
		
		boolean eq=name.equals(name1);
		System.out.println(eq);
		
		String tr=name1.trim();
		System.out.println(tr);
		
		String conc=name.concat(name1);
		System.out.println(conc);
		
		String str1=name.substring(1);
		System.out.println(str1);
		
		String sub2=name.substring(1, 12);
		System.out.println(sub2);
		
		boolean cont=name.contains(sub2);
		System.out.println(cont);
	}

}
