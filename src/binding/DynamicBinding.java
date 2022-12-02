package binding;

public class DynamicBinding {

	public static void main(String[] args) {
		//In the above example object type cannot be determined by the compiler, 
		//because the instance of Dog is also an instance of Animal.
		//So compiler doesn't know its type, only its base type.
		Animal d2 = new Dog();
		d2.eat();

	}

}
