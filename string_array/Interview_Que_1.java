package string_array;

public class Interview_Que_1 {

	public static void main(String[] args) 
	{
		String s1= "Pankaj Prasad";
		String word[]=s1.split(" ");
		
		String w1=word[0];
		String w2=word[1];
		for (int i=w1.length()-1; i>=0;i--)
		{
			System.out.print(w1.charAt(i));
		}
		System.out.print(" ");
		for (int j=w2.length()-1; j>=0;j--)
		{
			System.out.print(w2.charAt(j));
		}



	}

}
