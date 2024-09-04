package java_Revision;

public class This_Keyword 
{
	int age;
	String name;
	
	void teacher(int age,String name)
	{
		this.age=age;
		this.name=name;
		System.out.println("I am a teacher");
	}

	public static void main(String[] args) 
	{
		This_Keyword t1=new This_Keyword();
		t1.teacher(32, "Pankaj");
		System.out.println(t1.age);
		System.out.println(t1.name);

	}

}
