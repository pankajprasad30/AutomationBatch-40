//Execute the Scanner Class with all the methods using local Variable
package assignments;
import java.util.Scanner;
public class Assignment_7 
{
	static void add()
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Output from Static method: Add="+sum);
	}
	void subtract()
	{
		Scanner s2=new Scanner(System.in);
		int a=s2.nextInt();
		int b=s2.nextInt();
		int sub=b-a;
		System.out.println("Output from Non Static method: Sub="+sub);
	}
	public static void main(String[] args) 
	{
		add();
		Assignment_7 nonstatic=new Assignment_7 ();
		nonstatic.subtract();
		
		Scanner s3=new Scanner(System.in);
		int a=s3.nextInt();
		int b=s3.nextInt();
		int mod=a%b;
		System.out.println("Output from Main method: Modulus="+ mod);		
	}
}

