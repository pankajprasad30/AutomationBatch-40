package java_Program;

public class Find_Small_Number 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,7,90,-10};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
