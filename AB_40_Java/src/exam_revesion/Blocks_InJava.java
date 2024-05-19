//Blocks in java
package exam_revesion;
public class Blocks_InJava
{
  static
  {
    System.out.println("SIB");
  }
  {
    System.out.println("IIB");
  }
  static void add()
  {
  System.out.println(" Static method");
  }
  void add(int a)
  {
  System.out.println(" Non-Static method");
  }
  
  public static void main(String[]args)
  {
  
  Blocks_InJava a1=new Blocks_InJava();
  a1.add(10);
  System.out.println("Main Method");
  add();
  }
}