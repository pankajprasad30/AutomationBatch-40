//To check Multiple Inheritance
package assignments;
class father
{
	static void father_1()
	{
		System.out.println("Father class");
	}
}
class mother
{
	static void mother_1()
	{
		System.out.println("Father class");
	}
}
public class Assignment_15 extends mother  //,mother //consider its as a kid class
{

	public static void main(String[] args) 
	{
		System.out.println("kid class");
		mother_1();
		//father_1();

	}

}
