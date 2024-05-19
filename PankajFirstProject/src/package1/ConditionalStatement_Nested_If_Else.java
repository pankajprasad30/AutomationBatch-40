package package1;

public class ConditionalStatement_Nested_If_Else
{
  public static void main(String[] args)
  {
	  int a=30;
	  int b=50;
	  int c=90;
	  if (c>=a)// true
	  {
		  if (b<c)// t
		  {
			  System.out.println("Print 11");
		  }
		  else
		  {
			  System.out.println("Print 22");
		  }
	  }
	  else
	  {
		  
		  System.out.println("Print 2");
	  }
}
}
