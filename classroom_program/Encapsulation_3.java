package classroom_program;

class Authentication
{
	private String UserName="pankajprasad30";
	private String Password="pankaj#@!^%!@#(*^&%^";
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
}
public class Encapsulation_3 
{

	public static void main(String[] args) 
	{
		Authentication u1=new Authentication();
	    u1.setUserName("9930034615");
		System.out.println(u1.getUserName());
		u1.setPassword("Pankaj@123");
		System.out.println(u1.getPassword());
		

	}

}
