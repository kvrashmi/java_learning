package abstraction;
//Rule1: Cannot instantiate an abstract class
public class DerivedClass1 extends AbstractClass1 {
	
	public void fun()
	{
		System.out.println("I am from AbstractClass1 and  implemented in DerivedClass1");
	}
	
	public static void main(String[] args) {
		//Rule1: Cannot instantiate an abstract class
		//AbstractClass1 ac1= new AbstractClass1();
		
		DerivedClass1 dc1=new DerivedClass1();
		dc1.fun();
		
	}

}
