package collection;

import java.util.ArrayList;
import java.util.Vector;

public class Collection_1 {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();// yaad kar lena
		a1.add(100);
		a1.add(200);
		a1.add(400);
		a1.add("Pankaj");
		a1.add(true);
		a1.add(false);
		a1.add(30.7878);
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add('P');
		
		System.out.println(a1);
		
		Vector a2=new Vector();
		a2.add(123);
		a2.add(123);
		a2.add("Pankaj");
		a2.add("Pankaj");
		a2.add(null);
		a2.add(null);
		a2.add(null);
		a2.add(true);
		System.out.println(a2);
		
		
		
		

	}

}
