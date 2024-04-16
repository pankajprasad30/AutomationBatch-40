package classroom_program;

class studentdata
{
	private int age=18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Encapsulation_2 
{

	public static void main(String[] args) 
	{
		studentdata a1= new studentdata();
		a1.setAge(20);
		System.out.println(a1.getAge());

	}

}
