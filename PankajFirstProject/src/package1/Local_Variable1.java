package package1;

public class Local_Variable1 {
	static void add(int a,int b)
	{
		int add=a+b;
		System.out.println(add);		
	}
	void add()
	{
		String name="Pankaj";// Local
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		add(100,200);
		
		Local_Variable1 a1=new Local_Variable1();
		a1.add();

	}

}
