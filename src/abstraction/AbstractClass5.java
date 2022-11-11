package abstraction;
/*
 * For any abstract java class we are not allowed to create an object i.e., for abstract class instantiation is not possible. 
 */
public abstract class AbstractClass5 {
	
	abstract void fun();

	public static void main(String[] args) {
		//AbstractClass5 ac5 = new AbstractClass5();  - Cannot instantiate the type AbstractClass5
	}

}

