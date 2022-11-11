package abstraction;
/*
 * Abstract classes can also have final methods (methods that cannot be overridden).
 * 1. create a non-abstract method
 * 2. make it final
 */
public abstract class AbstractClass4 {
	 
	final void fun() { //This is a non-abstract final method
		System.out.println("This method is from abstract class, final method and it cannot be overridden..");
	}
	
	abstract void fun1(); //Abstract method cannot be final. We need to implement in derived class - hence we cannot make it final.
}

