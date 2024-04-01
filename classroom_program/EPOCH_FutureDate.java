package classroom_program;

import java.util.Date;

public class EPOCH_FutureDate {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1);
		
		//1 day=24, 1 hour=60 minutes, 1 minute=60 seconds, 1 seconds=1000 millisecond
		Date d2=new Date(d1.getTime()-(10*24*60*60*1000));
		System.out.println(d2);

	}

}
