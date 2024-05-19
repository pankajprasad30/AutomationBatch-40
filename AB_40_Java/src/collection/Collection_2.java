package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_2 {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();// yaad kar lena
		a1.add(100);
		a1.add(200);
		a1.add(400);
		a1.add(10);
		a1.add(-30);
		Collections.sort(a1);
		System.out.println(a1);

	}

}
