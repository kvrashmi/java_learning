package constructors;

/*Parameterized Constructor
 * A constructor that has parameters is known as parameterized constructor. 
 * If we want to initialize fields of the class with our own values, then use a parameterized constructor.
 * Does constructor return any value?
 * There are no “return value” statements in the constructor, but the constructor returns the current class instance. We can write ‘return’ inside a constructor.
 * 
 */

//Importing required inputoutput class
import java.io.*;

public class ConstructorWithParameter {
	// data members of the class.
	 String name;
	 int id;

	 // Constructor would initialize data members
	 // With the values of passed arguments while
	 // Object of that class created
	 ConstructorWithParameter(String name, int id)
	 {
	     this.name = name;
	     this.id = id;
	 }
	 
	 public static void main(String[] args)
	 {
	     // This would invoke the parameterized constructor.
		 ConstructorWithParameter geek1 = new ConstructorWithParameter("Adam", 1);
	     System.out.println("GeekName :" + geek1.name
	                        + " and GeekId :" + geek1.id);
	 }
}
