package revision_15_07_2024;

import java.util.ArrayList;
import java.util.List;

public class Collection_3 {

	public static void main(String[] args) 
	{
		List<String> a1=new ArrayList<String>();
		a1.add("Pankaj");
		a1.add("Prasad");
		//System.out.println(a1.size());
		
		String[] s1=new String[a1.size()];
	    String [] s3=a1.toArray(s1);
	    
	    System.out.println(s3[0]);
	    System.out.println(s3[1]);

	}

}
