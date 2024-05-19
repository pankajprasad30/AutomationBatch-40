
// Abstract class with, 1class: 2 Abstract method,1 concrete method, 2class: 2 AM,1 CM, Child class : 2 CM.
package classroom_program;
abstract class grandparent
{
	abstract void add();//  Abstract method
	abstract void sub();//  Abstract method
	void multiply() // Concrete method or Non-Static method
	{
		System.out.println("Multiply");
	}
}
abstract class parent_1 extends grandparent
{
	abstract void divide(); //Abstract method
	abstract void modulus(); //Abstract method
	static void pankaj() // Concrete method or Static method
	{
		System.out.println("Pankaj Prasad");
	}
}
public class Abstract_class_1 extends parent_1
{
	static void darshika()// Concrete method or Static method
	{
		System.out.println("Darshika");
	}
	void neha ()// Concrete method or Non-Static method
	{
		System.out.println("Neha");
	}
	public static void main(String[] args) 
	{
		Abstract_class_1 a1= new Abstract_class_1();
		a1.add();
		a1.sub();
		a1.multiply();
		a1.divide();
		a1.modulus();
		pankaj();
		darshika();
		a1.neha();
	}
	@Override
	void divide() {
		System.out.println("Divide");	
	}
	@Override
	void modulus() {
		System.out.println("Modulus");		
	}
	@Override
	void add() {
		System.out.println("Addition");		
	}
	@Override
	void sub() {
		System.out.println("Subtraction");		
	}

}
