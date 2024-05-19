package assignments;

public class Assignment_24 
{

	public static void main(String[] args) 
	{
		double a= Math.PI;// double gives upto 15 decimal number
		System.out.println(a);
		int f= Math.addExact(20, 30);
		System.out.println(f);
		double g=Math.random();
		System.out.println("Random no between 1 & 0 : "+g);

		// Print Greatest & Lowest number between two using math class for int & double data type.
		int b=Math.max(40, 600);
		System.out.println("Greatest number between two is : "+b);
		int c=Math.min(20, 40);
		System.out.println("Lowest number between two is : "+c);
		double d=Math.max(30.44, 89.000088899);
		System.out.println("Greatest number between two is : "+d);
		double e=Math.min(10.88888888342, 67.78789792837);
		System.out.println("Lowest number between two is : "+e);
		
	}

}
