package revision_15_07_2024;

public class NthLargestandNthSmallest 
{
	public static int ThirdLargest(int []a,int total)
	{
		for(int i=0;i<total;i++)//i=0,0<4//i=1,1<4//i=2,2<4
		{
			for(int j=i+1;j<total;j++)//
			{
				if(a[i]>a[j])///a[1]>a[3]
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		//return a[total-2];
		return a[5-1];
	}
	

	public static void main(String[] args) 
	{
		
		int a[]= {12,3,5,13,11,56,32,56,78,98};
		int x=a.length;
	System.out.println(ThirdLargest(a,x));	
	}
}
