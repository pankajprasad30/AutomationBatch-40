package revision_13_06_2024;

import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		String a=s1.next();
		//String a="pankajhhejqwhk2`12`1*&^!@#*&!";
		String b=a.replaceAll("[a-z1-9]", "");
		System.out.println(b);
		System.out.println(b.length());
		
		String c="ihfiuhwi1093481^%!@#&^2-";
		String d=c.replaceAll("[a-z]", "");
		//System.out.println(d);

	}

}
