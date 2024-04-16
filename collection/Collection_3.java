package collection;

import java.util.ArrayList;

public class Collection_3 {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();// yaad kar lena
		a1.add(100);
		a1.add(200);
		a1.add(400);
		a1.add("Pankaj");
		//a1.remove("Pankaj");
		//a1.clear();
		//a1.removeAll(a1);
		System.out.println(a1);
		a1.addAll(a1);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains("Pankaj"));
		
		System.out.println(a1.size());
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add(300);
		a2.add(600);
		a2.add(40.35345);
		//a2.clear();
		System.out.println(a2);
		System.out.println(a2.containsAll(a1));

	}

}
