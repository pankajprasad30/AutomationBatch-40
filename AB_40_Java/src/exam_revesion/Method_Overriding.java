//Method overriding
package exam_revesion;
class parent
{ 
   void add()
   {
   System.out.println("Addition");
   }
}
public class Method_Overriding extends parent
{ 
    void add()
   {
   super.add();
   System.out.println("Addition-1");
   }
   
   public static void main(String[] args)
   {
   Method_Overriding a1=new Method_Overriding();
   a1.add();
   
   }
}