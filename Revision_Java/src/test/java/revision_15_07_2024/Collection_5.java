package revision_15_07_2024;

import java.util.Set;
import java.util.TreeSet;

public class Collection_5 {

	public static void main(String[] args) 
	{
		Set<Object> s1=new TreeSet<Object>();
		s1.add(20);
		s1.add(30);
		s1.add(10);
		
		boolean b1=s1.isEmpty();
		System.out.println(b1);
		
		for (Object x:s1)
		{
			System.out.println(x);
		}
		
		

	}

}
