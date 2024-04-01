package classroom_program;
class State_Class
{
static void multiple()
{
	System.out.println("multiply");
}
void division()
{
	System.out.println("dividing");
}
}
public class City_Class extends State_Class
{
	static void add()
	{
		System.out.println("adding");
	}
	 void subtracting()
	{
		System.out.println("adding");
	}
public static void main(String[] args) 
{
	add();
	multiple();
	City_Class c1=new City_Class();
	c1.subtracting();
	c1.division();	
}
}

