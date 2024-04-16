package collection;
class one
{
	void add()
	{
		System.out.println("Addition");
	}
}

public class Upcasting_09 extends one
{
	void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 
	{
		
		one a1=(Upcasting_09)new Upcasting_09(); //upcasting expli
		a1.add();
		Upcasting_09 s1= (Upcasting_09)a1;//downcastiong/ expecitely
		s1.add();
	    s1.sub();
		
		

	}

}
