//Method overloading
package exam_revesion;
public class Method_Overloading
{
   static void add()
   {
   System.out.println("Addition");
   }
   static void add(int a)
   {
   System.out.println("Addition-1");
   }
   void add(String b)
   {
    System.out.println("Addition-2");
   }
   void add(boolean b)
   {
    System.out.println("Addition-3");
   }
   
   public static void main(String[]args)
   {
   add();
   add(10);
   Method_Overloading a1=new Method_Overloading();
   a1.add("Pankaj");
   a1.add(true);
   
   }
}
