package classroom_program;
class Amazon
{
	private String username="pankaj@gmail.com";

	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
}

public class Encapsulation_1 
{
	public static void main(String[] args) 
	{
		Amazon a1= new Amazon();
		a1.setusername("Pankajprasad30@gmail.com");
		System.out.println(a1.getusername());

	}

}
