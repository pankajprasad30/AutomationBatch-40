package selenium_Program;

public class Prog_2 {

	public static void main(String[] args) 
	{
//		reverse of words in String
//		Input : "My name is kriti. I love Programming"
//		Output : "kriti is name My. Programming love I"
		
		String str= "My name is kriti. I love Programming";
		String[] word=str.split("\\. ");// rem
		String word1=word[0];
		String word2=word[1];
		
		String[] s1=word1.split(" ");
		
		String s11=s1[0];
		String s12=s1[1];
		String s13=s1[2];
		String s14=s1[3];
		
		
		System.out.println(s14+" " +s13 +" "+s12+" " +s11  );
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(word1);
		//System.out.println(word2);


	}

}
