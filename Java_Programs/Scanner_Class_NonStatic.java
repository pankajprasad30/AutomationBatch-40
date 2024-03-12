package classroom_program;

import java.util.Scanner;

public class Scanner_Class_NonStatic 
{
	static int a;
	static int b;
	static int sum;
	void add()
	{
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		sum=a+b;
		
		/*int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;*/
		System.out.println(sum);
		
	}

	public static void main(String[] args) 
	{
		Scanner_Class_NonStatic a1=new Scanner_Class_NonStatic ();
		a1.add();

	}

}
