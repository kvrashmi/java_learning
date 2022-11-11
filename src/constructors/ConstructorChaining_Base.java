package constructors;

public class ConstructorChaining_Base {
	String name;
	
	ConstructorChaining_Base()
	{
		this("I will call parameterized constructor...");
		System.out.println("No argument constructor of base class...");
	}
	
	ConstructorChaining_Base(String name)
	{
		this.name=name;
		System.out.println("Calling parameterized constructor of base...");
		System.out.println(this.name);
	}

}
