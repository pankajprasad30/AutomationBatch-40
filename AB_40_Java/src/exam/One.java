package exam;

public class One 
{

	public static void main(String[] args) 
	{
		int[] number= {3,7,2,9,4};
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
			{
				sum=sum+number[i];
			}
			
		}
		System.out.println(sum);
	}
}
