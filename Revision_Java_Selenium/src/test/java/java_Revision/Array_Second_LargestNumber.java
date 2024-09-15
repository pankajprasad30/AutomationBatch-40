package java_Revision;

import java.lang.reflect.Array;

public class Array_Second_LargestNumber {

	public static void main(String[] args) 
	{
		int temp,size;
		int number[]= {10,30,99,40,77};
		size=Array.getLength(number);
		
		for (int i=0;i<size-1;i++)
		{
			for(int j=i+1;i<size-1;j++)
			{
				if(number[i]>number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
				
			}
		}
		System.out.println(number[size-2]);
		

	}

}
