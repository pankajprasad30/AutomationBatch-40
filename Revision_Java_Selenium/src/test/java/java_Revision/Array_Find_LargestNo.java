package java_Revision;

public class Array_Find_LargestNo 
{
	public static int largest (int[]a, int total)
	{
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) 
	{
		int a[]= {3,7,4,5,0,2,6};
		int x=a.length;
		System.out.println(largest(a,x));

	}

}
