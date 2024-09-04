package revision_15_07_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection_2 {

	public static void main(String[] args) 
	{
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(30);
		a1.add(-10);
		//a1.add(null);
		//a1.remove(1);
	//	a1.remove(10);
		//a1.removeAll(a1);
		//a1.add(1, 11);
		Collections.sort(a1);
		for (Integer z:a1)
		{
			System.out.println(z);
		}
		
		/*Iterator<Object> i1=a1.iterator();
		while(i1.hasNext()== true)
		{
			System.out.println(i1.next());
		}*/

	}

}
