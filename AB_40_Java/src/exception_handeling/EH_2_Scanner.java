package exception_handeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EH_2_Scanner {

	public static void main(String[] args) 
	{
		try
		{
		Scanner s1=new Scanner(System.in);
		byte b1=s1.nextByte();
		System.out.println(b1);
		
		}
		catch (InputMismatchException a1)
		{
			System.out.println("Value is out of range for byte datatype");
		}
		catch (ArithmeticException a1)
		{
			System.out.println("Value is infinite");
		}
		finally
		{
			System.out.println("I am always there to help you");
		}
		
	}

}
