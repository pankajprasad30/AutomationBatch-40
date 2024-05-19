//create 5 static method and 5 non static method and call it inside main method 
package assignments;
public class Assignment_4 
{
	static void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	static void subtract()
	{
		int c=30;
		int d=40;
		int sub=d-c;
		System.out.println(sub);
	}
	static void multiply()
	{
		int e=12;
		int f=10;
		int multi=e*f;
		System.out.println(multi);
	
	}
	static void division()
	{
		float a=40;
		float b=10;
		float div=a/b;
		System.out.println(div);
	}
	static void modulus()
	{
		float a=5;
		float b=2;
		float mod=a%b;
		System.out.println(mod);
	}
	void add1()
	{
		int a=10,b=20;
		int add=a+b;
		System.out.println(add);
	}
	void sub1()
	{
		int a=10,b=20;
		int sub=a-b;
		System.out.println(sub);
	}
	void mult1()
	{
		int a=10,b=20;
		int mul=a+b;
		System.out.println(mul);
	}
	void div1()
	{
		float a=10,b=20;
		float div=a/b;
		System.out.println(div);
	}
	void mod1()
	{
		float a=10,b=20;
		float mod=a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) 
	{
		add();// call static method inside main method by its method name.
		subtract();
		multiply();
		division();
		modulus();
		Assignment_4  a1=new Assignment_4 ();
		a1.add1();// calling non static method with help of reference variable
		a1.sub1();
		a1.mult1();
		a1.div1();
		a1.mod1();
	}
}
