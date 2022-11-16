package polymorphism_overloading;

public class ConstructorSubclass extends ConstructorSuperclass {

	public ConstructorSubclass()
	{
		super(11,8); //constructor chaining 
	}
	public static void main(String[] args) {
		//A constructor will be called when we are creating an object
		ConstructorSubclass csc = new ConstructorSubclass(); // Instantiation 
	}

}
