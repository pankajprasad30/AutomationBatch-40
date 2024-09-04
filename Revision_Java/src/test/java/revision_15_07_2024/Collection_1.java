package revision_15_07_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_1 
{

	public static void main(String[] args) 
	{
		//CRUD,
		List<Object> a1=new ArrayList<Object>();
		a1.add(10);
		a1.add(30);
		a1.add(null);
		a1.add(null);
		a1.add("Pankaj");
		a1.add('P');
		a1.add(10);
		a1.add(30);
		a1.add(null);
		a1.add(null);
		a1.add("Pankaj");
		a1.add('P');
		a1.addFirst(11);
		a1.addLast(99);
		//a1.clear();
		a1.remove(2);
		
		boolean s1=a1.contains('L');
		System.out.println(s1);
		
		List<Object> a2=new ArrayList<Object>();
		a2.add(10);
		a2.add(30);
		a2.add(null);
		a2.addAll(a1);
		boolean b1=a1.equals(a2);
		System.out.println(b1);
		
		//boolean a4=a2.containsAll(a1);
		//System.out.println(a4);
		
		
		
		for (Object z:a1)
		{
			System.out.println(z);
		}
		
		/*Iterator<Object> itr=a1.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.hasNext());
		}*/
		
		
		
		
		
		
		//System.out.println(a1);
		
		

	}

}
