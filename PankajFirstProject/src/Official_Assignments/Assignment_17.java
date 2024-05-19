//WAP with 4 constructors and 1 IIB
package Official_Assignments;

public class Assignment_17 
{
	Assignment_17()
	{
		System.out.println("Cons 1");
	}
	Assignment_17(int a)
	{
		System.out.println("Cons 2");
		
	}
	Assignment_17(int a, int b)
	{
		System.out.println("Cons 3");
	}
	Assignment_17(String Name)
	{
		System.out.println("Cons 3");
	}
	{
		System.out.println("IIB block output");
	}
	public static void main(String[] args) {
		new Assignment_17();
		new Assignment_17(10);
		new Assignment_17(20,20);
		new Assignment_17("Pankaj");
	}
	

}
