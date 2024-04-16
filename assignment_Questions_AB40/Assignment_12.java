//Program on Method Overloading
package assignment_Questions_AB40;

public class Assignment_12 {
	static void add()
	{
		System.out.println("Output from 1st block");
	}
	static void add(int a)
	{
		System.out.println("Output from 2nd block");
	}
	void add(char a)
	{
		System.out.println("Output from 3rd block");
	}
	void add(float b)
	{
		System.out.println("Output from 4th block");
	}

	public static void main(String[] args) 
	{
		add();
		add(10);
		Assignment_12 a1=new Assignment_12();
		a1.add('p');
		a1.add(2.2f);
		

	}

}
