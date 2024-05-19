package classroom_program;

import java.util.Scanner;

public class Switch_Case_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();

		switch(a)
		{
		case 1: System.out.println("Switch 1");
		break;
		case 2: System.out.println("Switch 2");
		break;
		case 3: System.out.println("Switch 3");
		break;
		case 4: System.out.println("Switch 4");
		break;
		//default: System.out.println("Default Switch");
		
		}


	}

}
