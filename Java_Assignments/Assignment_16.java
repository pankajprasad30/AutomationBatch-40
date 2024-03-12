//Create Multi level Inheritance using 2 Abstract classes and 1 concrete class by creating 2 AbsMethods in Absclass1,creating 2 AbsMethods, 1 ConcreteMethod in Abssclass2, and 2 Concrete methods in Child class(Concrete class)
package assignments;

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
public class Assignment_16 extends parent_1
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
		Assignment_16 a1= new Assignment_16();
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
