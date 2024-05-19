package Assignments;

public class Assignment2_ConditionalOperators {

	public static void main(String[] args) 
	{
		int age=18;
		if ( age>20)
		{
			System.out.println("I must vote");
		}
        if ( age<20)
        {
        	System.out.println("I must vote1");
        }
        if (age>=18)
        {
        	System.out.println("I am eligble to vote");
        }
        if (age <=17)
        {
        System.out.println(" I am not eligble to Vote");
        }
        if (age == 18)
        {
        	System.out.println("I should Vote");
        }
        if (age!=17)  // not equal to will print output if age is not same as assigned value
        {
        	System.out.println("Not eligible to vote");
        }
	}

}
