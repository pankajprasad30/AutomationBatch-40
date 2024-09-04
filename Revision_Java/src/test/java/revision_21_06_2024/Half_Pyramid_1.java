package revision_21_06_2024;

public class Half_Pyramid_1 
{
	static void print(int n)
	{
		int i,a;
		for( i=0;i<n;i++)
		{
			for(a=n-i;a>1;a--)
			{
				System.out.print(" ");
				//System.out.print("");
			}
			//System.out.print("*");
		     for(a=0;a<i;a++)
		     {
		    	 System.out.print("* ");
		     }
		    System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int n=5;
		
		print(n);

	}

}
