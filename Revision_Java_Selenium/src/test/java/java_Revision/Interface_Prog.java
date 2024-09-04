package java_Revision;

interface website1
{
	abstract void login();
	void logout();
}

interface website 
{
	abstract void login();
	void logout();
}

public class Interface_Prog implements website,website1
{

	public static void main(String[] args) 
	{
		Interface_Prog i1=new Interface_Prog();
		i1.login();
		i1.logout();

	}

	@Override
	public void login() {
		System.out.println("Login");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout");
		
	}

}
