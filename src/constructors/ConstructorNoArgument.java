package constructors;

/*
 * No-argument constructor: A constructor that has no parameter is known as the default constructor. 
 * If we don’t define a constructor in a class, then the compiler creates a default constructor(with no arguments) for the class. 
 * And if we write a constructor with arguments or no arguments then the compiler does not create a default constructor. 
 * Note: Default constructor provides the default values to the object like 0, null, etc. depending on the type.
 */
public class ConstructorNoArgument {
	
	int num;
    String name;
 
    // this would be invoked while an object
    // of that class is created.
    ConstructorNoArgument() 
    { 
    	System.out.println("Constructor called"); 
    }
    
	public static void main(String[] args) {
		// this would invoke default constructor.
		ConstructorNoArgument geek1 = new ConstructorNoArgument();
 
        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(geek1.name);
        System.out.println(geek1.num);

	}

}
