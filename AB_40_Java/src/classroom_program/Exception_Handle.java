package classroom_program;

public class Exception_Handle {

	public static void main(String[] args) 
	{
		try
		{
			int[]numbers= {1,2,3};
			System.out.println("Element at index 3"+ numbers[3]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error");
		}
	}

}
