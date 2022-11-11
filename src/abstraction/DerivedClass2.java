package abstraction;
//Rule2:can contain constructors
public class DerivedClass2 extends AbstractClass2{
	
	// Constructor of class2
    DerivedClass2(String message) //constructor of type default.
    {
    	super(message); //Even if this statement is not given it will be called.
        System.out.println("Now I am from DerivedClass2...");
    }
 
    // Method of class2
    void fun()
    {
        System.out.println("I am from AbstractClass2 and  implemented in DerivedClass2...");
    }
    
	public static void main(String[] args) {
		DerivedClass2 dc2=new DerivedClass2("Hi Iam Duncan...");
		dc2.fun();
	}

}
