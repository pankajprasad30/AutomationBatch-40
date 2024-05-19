// Array Index Out Of Bounds Exception
package all_exceptions;
public class Array {

	public static void main(String[] args) 
	{
		int a1[]=new int[3];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		a1[4]=4;
		System.out.println(a1[4]);

	}

}
