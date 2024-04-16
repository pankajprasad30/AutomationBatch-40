package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_4 {

	public static void main(String[] args) 
	{
		List a1= new ArrayList();
		a1.add("132");
		a1.add("222");
		//a1.add(343);
		a1.add("776");
		//a1.add(true);
		Collections.sort(a1);
		System.out.println(a1);
		
		

	}

}
