package array_program;

import java.util.Arrays;

public class Array_4 
{

	public static void main(String[] args) 
	{
		int RN[]= {90,40,30,-10};
		
		Arrays.sort(RN);
		System.out.println(Arrays.toString(RN));
		
		
		
		//Enhanced for loop
		for (int i:RN)
		{
			System.out.println(i);
		}

	}

}
