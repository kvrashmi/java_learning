package constructors;

/*
 * A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
 * It can be used to set initial values for object attributes. 
 * A constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor,
 * memory for the object is allocated in the memory. 
 * It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.
 * It is not necessary to write a constructor for a class. 
 * It is because java compiler creates a default constructor if your class doesn’t have any.
 * 
 * Constructors vs Methods:
 * Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
 * Constructors do not return any type while method(s) have the return type or void if does not return any value.
 * Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
 * 
 * The rules for writing constructors are as follows:
    1. Constructor(s) of a class must have the same name as the class name in which it resides.
    2. A constructor in Java can not be abstract, final, static, or Synchronized.
    3. Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
    
 * Types of Constructors in Java
	Now is the correct time to discuss the types of the constructor, so primarily there are two types of constructors in java: 
		1.No-argument constructor
        2.Parameterized Constructor
		1. No-argument constructor: A constructor that has no parameter is known as the default constructor. If we don’t define a constructor in a class, then the 
		compiler creates a default constructor(with no arguments) for the class. And if we write a constructor with arguments or no arguments then the compiler does 
		not create a default constructor. 
	Note: Default constructor provides the default values to the object like 0, null, etc. depending on the type.
 */


public class Constructor {

	/*This what compiler does by default-when no constructor is created. 
	 * Super class of every class in Java is Object even if we do not use extends in class definition.
	*/
	Constructor() {
		super(); 
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor();
	}

}
