package crossKT;

class World
{
	World()
	{
		System.out.println("World........");
	}
}
class Earth extends World
{
	Earth()
	{
		super();
		System.out.println("Earth.....");
	}
	
}

public class SuperCalling_Statement 
{
	public static void main(String[] args) 
	{
		Earth a1=new Earth();
		
	}

}
