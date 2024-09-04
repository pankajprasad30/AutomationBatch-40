package selenium_Program;
public class Inheritance
{
     public static void main(String[] args)
     {
    	 new Device().plug();
    	 }
    	 }
    	 interface Pluggable
    	 {
    	 void plug();
    	 }
    	 
    	 class Device implements Pluggable
    	 {
    	 public void plug ()
    	 {
    	 System.out.println("plugged");
    	 }
    	 }
    	 abstract class Computer extends Device
    	 {
    	 public abstract void plug();
    	 }
