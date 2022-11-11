package abstraction;
/*
 * Abstract classes can also have final methods (methods that cannot be overridden)
 */
public class DerivedClass4 extends AbstractClass4{

	void fun1()
	{
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		DerivedClass4 dc4 = new DerivedClass4();
		dc4.fun();
		dc4.fun1();
	}

}
