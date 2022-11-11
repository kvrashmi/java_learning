package constructors;

public class ConstructorChaining_Derived extends ConstructorChaining_Base {

	ConstructorChaining_Derived()
	{
		super();
		System.out.println("No argument constructor of derived class...");
	}
	
	ConstructorChaining_Derived(String name)
	{
		super(name);
		System.out.println("Calling parameterized constructor of derived");
	}
	
	public static void main(String[] args) {

		ConstructorChaining_Derived ccd1 = new 
				ConstructorChaining_Derived();
		
		ConstructorChaining_Derived ccd2 = new 
				ConstructorChaining_Derived("test");
		

	}

}
