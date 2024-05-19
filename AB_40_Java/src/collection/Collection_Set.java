package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_Set {

	public static void main(String[] args) 
	{
		Set a1= (Set)new TreeSet();
		/*a1.add(20);
		a1.add(30);
		a1.add(333);
		a1.add(4444);
		a1.add(10);
		//a1.add(11.22);
		a1.add(50);
		a1.add(50);*/
		a1.add("Pankaj");
		//a1.add(null);
		
		//a1.add(null);
	//	System.out.println(a1);
		
		Iterator i1=	a1.iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}

	}

}
