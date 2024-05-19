package exam_revesion;

public class This_Keyword1 
{
	int age=10;
	String name="Pankaj";
	void student(int age,String name)
	{
		this.age=age;
		this.name=name;
		System.out.println("o/p from non static");
	}

	public static void main(String[] args) 
	{
		This_Keyword1 a1=new This_Keyword1 ();
		a1.student(10, "ramesh");
		System.out.println(a1.age);
		System.out.println(a1.name);

	}

}
