package package1;

public class Local_Global {
	static int a=200;//global
	static void add()
	{
		a=10;
		int area=a*6;
		System.out.println(area);
	}

	public static void main(String[] args) 
	{		
		System.out.println(a);
		add();
		int a=20;//local
		System.out.println(a);
		
	}

}
