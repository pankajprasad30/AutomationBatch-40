package java_Revision;

import java.util.HashMap;
import java.util.Map;

public class Collection_Pro {

	public static void main(String[] args) 
	{
			Map<Object,String> m1=new HashMap<Object,String>();
			m1.put(1,"P");
			m1.put(2,"A");
			m1.put(3,"B");
			m1.put(2,"C");
			
			System.out.println(m1);

	}

}
