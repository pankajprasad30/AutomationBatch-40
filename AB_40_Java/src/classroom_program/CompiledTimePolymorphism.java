// CompiledTimePolymorphism can be achieved from method overloading 
package classroom_program;

public class CompiledTimePolymorphism 
{
	void add()
	{
		System.out.println("Addition 1");
	}
	void add(int a)
	{
		System.out.println("Addition 2");		
	}
	static void add(boolean b)
	{
		System.out.println("Addition 2");
	}

	public static void main(String[] args) 
	{
		CompiledTimePolymorphism a1= new CompiledTimePolymorphism();
		a1.add();
		a1.add(10);
		add(true);
	}

}
