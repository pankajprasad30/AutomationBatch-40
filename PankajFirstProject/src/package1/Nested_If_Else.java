package package1;
public class Nested_If_Else 
{
public static void main(String[] args) 
{
	int salary=10000;
	char gender='M';
	
	if(salary>=10000)//true
	{
		if(gender=='F')
		{
			System.out.println("Logic 1");
		}
		else
		{
			System.out.println("Logic 2");
		}
	}
	else
	{
		System.out.println("Logic 3");
	}
	
	
	
}
}
