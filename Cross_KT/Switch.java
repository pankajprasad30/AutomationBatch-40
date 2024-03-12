package crossKT;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		int a=s1.nextInt();
		s1.close();
		
		switch(a)
		{
		case 1: System.out.println("Case-1");
		break;
		case 2: System.out.println("Case-2");
		break;
		
		case 3: System.out.println("Case-3");
		break;
		default : System.out.println(" No proper value");
		break;
		
		
		}

	}

}
