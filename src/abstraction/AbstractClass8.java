package abstraction;
/*
 * If a class contains at least one abstract method then compulsorily we should declare the class as abstract otherwise we will get a 
 * compile-time error because If a class contains at least one abstract method then, implementation is not complete for that class, 
 * and hence it is not recommended to create an object so in order to restrict object creation for such partial classes we use 
 * abstract keyword.
 */
public abstract class AbstractClass8 {
	
	void fun()
	{
		
	}
	
	void fun1()
	{
		
	}
	
	abstract void fun2();
}


//Instantiation - object creation
