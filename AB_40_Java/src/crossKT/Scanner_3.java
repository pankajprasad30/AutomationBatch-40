package crossKT;

import java.util.Scanner;

public class Scanner_3 
{
	static Scanner s1=new Scanner(System.in);// With global
	static int a=s1.nextInt();	
	static int b=s1.nextInt();	
	static int sum=a+b;
	
	void add()
	{
		
		System.out.println(sum+"Pankaj");
	}

	public static void main(String[] args) 
	{
		System.out.println(sum);
		Scanner_3 a1=new Scanner_3 ();
		a1.add();

	}

}
