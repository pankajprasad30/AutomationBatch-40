package type_casting;
class country
{
	void India()
	{
		System.out.println("India");
	}
}

public class State extends country
{
	void Delhi()
	{
		System.out.println("Delhi");
	}

	public static void main(String[] args) 
	{
		
		country a1= new State();// upcasting, implicitly
		//country a1= (country)new State(); //upcasting, explicit
		
		a1.India();
		State b1= (State)a1;//explicit,downcasting
		b1.Delhi();
		b1.India();
		

	}

}
