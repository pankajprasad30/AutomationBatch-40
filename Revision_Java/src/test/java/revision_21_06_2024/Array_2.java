package revision_21_06_2024;

public class Array_2 
{
	static void rotate(int ar[],int d,int n)
	{
		d=d%n;
		int temp[]=new int[n];
		int k=0;
		for(int i=d;i<n;i++)
		{
			temp[k]=ar[i];
			k++;	
		}
		for (int i=0;i<d;i++)
		{
			temp[k]=ar[i];
			k++;	
		}
		for (int i=0;i<n;i++)
		{
			ar[i]=temp[i];
			k++;	
		}
	}
	static void print(int ar[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] ar= {1,2,3,4,5,6,7};
		int n=ar.length;
		int d=1;
		
		rotate(ar,d,n);
		print(ar,n);
		
		// 1st rotation--> {2,3,4,5,6,7,1}
		//2nd rotation--> {3,4,5,6,7,1,2}
		//3nd rotation--> {4,5,6,7,1,2,3}
	}

}
