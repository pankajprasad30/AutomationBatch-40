package java_Revision;

import java.util.Arrays;

public class Array_Pro {

	public static void main(String[] args) 
	{
		int serialNo[]=new int [3];
		serialNo[0]=10;
		serialNo[1]=80;
		serialNo[2]=40;
		
		Arrays.sort(serialNo);
		
		for(int a:serialNo)
		{
			System.out.println(a);
		}
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(serialNo[i]);
		}
				
		String car[]= {"BMW","Maruti","Tata"};
		System.out.println(car[1]);
		
		int length = car.length;
		System.out.println(length);

	}

}
