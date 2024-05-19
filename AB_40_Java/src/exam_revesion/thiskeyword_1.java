//This keyword
package exam_revesion;
public class thiskeyword_1
{
       int age;
	   String name;
	   void student(int age, String name)
	   {
	   this.age=age;
	   this.name=name;
	      System.out.println("output from non static");
	   }


       public static void main(String[]args)
	   {
	      thiskeyword_1 a1=new thiskeyword_1();
		  a1.student(20, "Sahil");
		  System.out.println(a1.age);
		  System.out.println(a1.name);
		  
		  
	       
	   }
}