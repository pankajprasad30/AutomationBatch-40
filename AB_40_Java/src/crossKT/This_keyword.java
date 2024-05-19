package crossKT;

public class This_keyword 
{
	int age;
	String name;
	char a;
	void student(int age, String name, char a)
	{
		this.age=age;
		this.name=name;
		this.a=a;
		System.out.println("Non static");
	}

	public static void main(String[] args) 
	{
		This_keyword a1=new This_keyword ();
		a1.student(10, "Pankaj", 'P');
		System.out.println(a1.age);
		System.out.println(a1.name);
		System.out.println(a1.a);

	}

}
