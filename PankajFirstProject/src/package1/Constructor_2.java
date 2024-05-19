package package1;

public class Constructor_2 
{
	Constructor_2()
	{
		System.out.println("Constructor");
	}
   public static void main(String[] args) 
   {
	   System.out.println("Print 1");
	  // Constructor_2 a1=new Constructor_2();
	   new Constructor_2();// use this if you want to call constructor
	   System.out.println("Print 2");
	
}
}
