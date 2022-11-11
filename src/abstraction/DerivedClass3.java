package abstraction;
/* An abstract class can have a non abstract method
 * An abstract class can be without any abstract method.
 * In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be 
 * instantiated but can only be inherited. 
 */
public class DerivedClass3 extends AbstractClass3{
	
	/*
	void notFun()
	{
		System.out.println("This is an abstract method from AbstractClass3..");
	}
	*/
	public static void main(String[] args) {
        DerivedClass3 d3 = new DerivedClass3();
        d3.fun();
        //d3.notFun();
	}

}
