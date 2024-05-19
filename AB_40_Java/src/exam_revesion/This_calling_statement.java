package exam_revesion;

public class This_calling_statement 
{
	This_calling_statement ()
	{
		System.out.println("Pankaj");
	}
	This_calling_statement (int a)
	{
		this();
		System.out.println("Prasad");
	}
	public static void main(String[] args) 
	{
		new This_calling_statement (10);
	}

}
