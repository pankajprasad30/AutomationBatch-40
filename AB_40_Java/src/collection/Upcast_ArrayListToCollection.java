package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Upcast_ArrayListToCollection {

	public static void main(String[] args) 
	{
		Collection c1= new ArrayList();
		c1.add(100);
		c1.add(100);
		c1.add("Pankaj");
		c1.add(1786896789);
		c1.add(null);
		System.out.println(c1);

	}

}
