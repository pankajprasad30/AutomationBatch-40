package hierarchical_inheritance;
class prasad
{
	static void add()
	{
		System.out.println("1");
	}
}
class pankaj extends prasad
{
	
	public static void main(String[] args) 
	{
		System.out.println('s');
		add();
	}
}

public class Not_Possible extends prasad
{

	public static void main(String[] args)
	{
		System.out.println("D");
		add();

	}

}
