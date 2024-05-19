//To create 5 static method and 5 non static method and call it inside the main method 
package assignment_Questions_AB40;
public class Assignment_7 {
	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
	static void div()
	{
		System.out.println("Division");
	}
	static void mod()
	{
		System.out.println("Modulus");
	}
	void add1()
	{
		System.out.println("Addition 1");
	}
	void sub1()
	{
		System.out.println("Subtraction 1");
	}
	void mul1()
	{
		System.out.println("Multiplication 1");
	}
	void div1()
	{
		System.out.println("Division 1");
	}
	void mod1()
	{
		System.out.println("Modulus 1");
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
		Assignment_7 a1= new Assignment_7();
		a1.add1();
		a1.sub1();
		a1.mul1();
		a1.div1();
		a1.mod1();

	}

}
