package package1;

public class LogicalOperators_OR 
{
  public static void main(String[] args) 
  {
	int q=90;
	int w=70;
	int e=30;
	if (q>w || w>e)
	{
		System.out.println("Print 1");
	}
	if (e!=10 || e>w)
	{
		System.out.println("Print 2");
	}
	if (e>=q || e<q)
	{
		System.out.println("Print 3");
	}
	if (e==q || w<=e)
	{
		System.out.println("Print 4");
	}
}
}
