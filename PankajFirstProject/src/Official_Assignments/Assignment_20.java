//WAP with 3 methods main,static add and static subtract. Declare a and b as static global variables and initialize then in each method and perform addition and subtraction
package Official_Assignments;

public class Assignment_20 
{

		static int a; //Declaration
		static int b;

		static void add()
		{
			a=30;// Initialization
			b=90;
			int add=a+b;
			System.out.println(add);
					
		}
		static void subtract()
		{
			a=50;
			b=80;
			int subtract=b-a;
			System.out.println(subtract);
			
		}

		public static void main(String[] args) 
		{
			add();
			subtract();
			
		}

	

}
