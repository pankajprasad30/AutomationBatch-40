package array_program;

import java.util.Scanner;

public class Array_Scanner {

	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		
		System.out.println("Enter the 2 value which you want to store in array : ");
		
		int value[]=new int[2];
		
		value[0]= a1.nextInt();	
		value[1]= a1.nextInt();			
		/*System.out.println(value[0]);
		System.out.println(value[1]);*/
		
		for (int i=0;i<2;i++)
		{
			System.out.println(value[i]);
			
		}
		
		

	}

}
