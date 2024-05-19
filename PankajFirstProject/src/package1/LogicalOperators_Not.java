package package1;

public class LogicalOperators_Not 
{
	public static void main(String[] args) {
		int u=78;
		int i=66;
		if (!(u>i && i!=60))// not operator reversing and operator result
		{
			System.out.println("Print Yes");
		}
		int o=23;
		int e=21;
		if (!(o>=e || e>o)) // Not operator reversing or operator output
		{
			System.out.println("Print Yes 1");
		}
		if (!(o>u || i!=66)) // or operator result is false but not operator reversing the result
		{
			System.out.println(" Print Yes 2");
		}
	}
}
