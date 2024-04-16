package array_program;

public class Array_TwoDimensional 
{
	public static void main(String[] args) 
	{
		int a[][]=new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=40;
		a[1][1]=80;
		//System.out.println(a[0][1]);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i][i]);
		
	}
	
	

}
