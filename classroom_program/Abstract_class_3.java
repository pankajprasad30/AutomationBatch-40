package classroom_program;
abstract class parent4
{
	abstract void login();
	abstract void logout();
	static void add()
	{
		System.out.println("Hello");
	}
	
}
abstract class parent3 extends parent4
{
	abstract void sub();
	
}
public class Abstract_class_3 extends parent3
{

	public static void main(String[] args) 
	{
		add();
		Abstract_class_3 a1=new Abstract_class_3();
		a1.login();
		a1.logout();
		a1.sub();

	}

	@Override
	void sub() {
		System.out.println("Subtraction");
		
	}

	@Override
	void login() {
		System.out.println("Login");
		
	}

	@Override
	void logout() {
		System.out.println("logout");
		
	}

}
