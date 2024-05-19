//Create a Array of length 5 & int data type & Store value in it using scanner class
package assignments;

import java.util.Scanner;

public class Assignment_20_2 {

	public static void main(String[] args) 
	{
		int a1[]=new int[5];
		for(int i=0;i<a1.length;i++)
		{
			@SuppressWarnings("resource")
			Scanner s1=new Scanner (System.in);
			
			a1[i]=s1.nextInt();
		}
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		System.out.println(a1[3]);
		System.out.println(a1[4]);
		
		

	}

}
