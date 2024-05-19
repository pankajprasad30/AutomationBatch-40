package collection;

import java.util.LinkedList;

public class LinkedList_Methods {

	public static void main(String[] args) 
	{
		LinkedList a1=new LinkedList();
		a1.add(10);
		a1.add(30);
		a1.add(90);
		a1.add(-10);
		a1.add(null);
		a1.add(30);
		
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1);

	}

}
