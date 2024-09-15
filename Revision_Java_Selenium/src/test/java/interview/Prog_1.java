package interview;

public class Prog_1 
{
	public static void commonprefix(String input)
	{
		char[] characters=input.toCharArray();
		int length=characters.length;
		System.out.println(" Common prefix is : ");
		for (int i=0;i<length;i++)
		{
			for (int j=i+1;j<length;j++)
			{
				if(characters[i]==characters[j])
				{
					System.out.print(characters[j]+ " ");
					break;
					
				}
			}
			
		}
	}

	public static void main(String[] args) 
	{
		String input="fly float fleet flower flip";
		commonprefix(input);

	}

}
