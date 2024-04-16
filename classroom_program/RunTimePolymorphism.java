// RunTimePolymorphism can be achieved by method overriding concept
package classroom_program;
class parent_9
{
	void add()
	{
		System.out.println("Addition");
	}
}
public class RunTimePolymorphism extends parent_9
{
	void add()
	{
		super.add();
		System.out.println("Addition 1");
	}
	public static void main(String[] args) 
	{
		RunTimePolymorphism a1= new RunTimePolymorphism();
		a1.add();

	}

}
