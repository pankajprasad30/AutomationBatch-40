package string_Functions;

public class String_Fun4 {

	public static void main(String[] args) 
	{
		String name="Pankaj Prasad";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));// dasarP jaknaP
		}
				
		//for o/p jaknaP dasarP 
		String[]word=name.split(" ");// Remember
		String w1=word[0];// Remember
		for(int i=w1.length()-1;i>=0;i--)
		{
			System.out.print(w1.charAt(i));
		}
		System.out.print(" ");
		
		String w2=word[1];
		for(int i=w2.length()-1;i>=0;i--)
		{
			System.out.print(w2.charAt(i));
		}
	}

}
