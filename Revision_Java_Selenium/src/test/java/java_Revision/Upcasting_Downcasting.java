package java_Revision;

class country
{
	void country1()
	{
		System.out.println("Country");
	}
}

public class Upcasting_Downcasting extends country
{
	void India1()
	{
		System.out.println("India");
	}

	public static void main(String[] args) 
	{
		//upcasting
		country c1=new Upcasting_Downcasting();
		c1.country1();
		
		Upcasting_Downcasting c2=(Upcasting_Downcasting)c1;
		c2.country1();
		c2.India1();
		
		

	}

}
