//input mismatch exceptions 
package all_exceptions;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) 
	{
		Scanner a1=new Scanner(System.in);
		byte a2=a1.nextByte();
		System.out.println(a2);
		a1.close();

	}

}
